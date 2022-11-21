package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends class Car {
    private int speed;
    public SportCar(){
    }
    public SportCar(int speed, String marka, String  klass, int weight, Driver driver, Engine motor) {
        super(marka,klass,weight,driver,motor);
        this.speed=speed;
    }

    public int getSped() {
        return speed;
    }

    public void setSped(int sped) {
        this.speed = sped;
    }
}
