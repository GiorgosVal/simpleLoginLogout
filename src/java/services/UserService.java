/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.UserDao;
import entities.User;

/**
 *
 * @author giorgos
 */
public class UserService {
    UserDao udao = new UserDao();
    
    public User getUser(String username) {    
        return udao.getUser(username);
    }
    
    public boolean updateUser(User user) {
        return udao.updateUser(user);
    }
    
    
    
    
    
    
    
}
