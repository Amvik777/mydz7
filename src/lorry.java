package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends class Car {
    private int cargo;

    public Lorry() {
    }

    public Lorry(int cargo, String marka, String klass, int weight, Driver driver, Engine motor) {
        super(marka, klass, weight, driver, motor);
        this.cargo = cargo;
    }

    public int getCargo() {
        return cargo;
    }

    public void setGryz(int gryz) {
        this.cargo = cargo;
    }
}