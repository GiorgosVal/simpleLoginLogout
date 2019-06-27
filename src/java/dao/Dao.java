/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;

/**
 *
 * @author giorgos
 */
public class Dao {
    protected final String URL = "jdbc:mysql://localhost:3306/exercisedb?serverTimezone=UTC";
    protected final String USERNAME = "root";
    protected final String PASS = "1234";
    protected Connection conn;
    

    
    
    
}
