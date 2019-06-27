/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author giorgos
 */
public class Car implements Serializable {
    private int id;
    private String brand;
    private String model;
    private int power;

    public Car() {
    }

    public Car(String brand, String model, int power) {
        this.brand = brand;
        this.model = model;
        this.power = power;
    }

    public Car(int id, String brand, String model, int power) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.power = power;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.brand);
        hash = 47 * hash + Objects.hashCode(this.model);
        hash = 47 * hash + this.power;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.power != other.power) {
            return false;
        }
        if (!Objects.equals(this.brand, other.brand)) {
            return false;
        }
        if (!Objects.equals(this.model, other.model)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", brand=" + brand + ", model=" + model + ", power=" + power + '}';
    }
    
    
    
    
}
