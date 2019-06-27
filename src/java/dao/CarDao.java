/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Car;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giorgos
 */
public class CarDao extends Dao {
    private final String getCars =  "SELECT * FROM `exercisedb`.`cars`";
    
    protected Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USERNAME, PASS);
        } catch (Exception ex) {
            Logger.getLogger(CarDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    private void closeConnections(ResultSet rs, Statement st) {
        try {
            rs.close();
            st.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CarDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    
    
    public List<Car> getCars() {
        List<Car> cars = new ArrayList();
        try {
            Statement st = getConnection().createStatement();
            ResultSet rs = st.executeQuery(getCars);
            while(rs.next()) {
                Car car = new Car(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                cars.add(car);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(CarDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cars;
    }
    
    
    
    
    
    
    
    
    
}
