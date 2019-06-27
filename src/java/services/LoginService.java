/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.User;

/**
 *
 * @author giorgos
 */
public class LoginService {
    
    public boolean getLogin(String username, String password) {
        UserService us = new UserService();
        User user = us.getUser(username);
        if (user != null) {
            if(password.equals(user.getPassword())) return true;
        }
        return false;
    }
    
    
    
    
}
