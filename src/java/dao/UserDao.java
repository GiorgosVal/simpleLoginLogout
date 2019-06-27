/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giorgos
 */
public class UserDao extends Dao {

    private final String getUser = "SELECT * FROM `exercisedb`.`users` WHERE `username` = ?";
    private final String updateUser = "UPDATE `exercisedb`.`users` SET `lastlogin` = ?, `ip` = ? WHERE `username` = ?";

    protected Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USERNAME, PASS);
        } catch (Exception ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    private void closeConnections(ResultSet rs, Statement st) {
        try {
            rs.close();
            st.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public User getUser(String username) {
        User user = null;
        try {
            PreparedStatement pst = getConnection().prepareStatement(getUser);
            pst.setString(1, username);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("pass"), rs.getString("lastlogin"), rs.getString("ip"));
            }
            rs.close();
            pst.close();
            return user;
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    public boolean updateUser(User user) {
        try {
            PreparedStatement pst = getConnection().prepareStatement(updateUser);
            pst.setString(1, user.getLastLogin());
            pst.setString(2, user.getIp());
            pst.setString(3, user.getUsername());
            if (pst.executeUpdate(updateUser) > 0) {
                pst.close();
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
