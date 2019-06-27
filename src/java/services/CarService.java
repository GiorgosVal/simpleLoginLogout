/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.CarDao;
import entities.Car;
import java.util.List;

/**
 *
 * @author giorgos
 */
public class CarService {
    CarDao cdao = new CarDao();
    
    public List<Car> getCars(){
        return cdao.getCars();
    }
    
}
