package com.company.details;

public class Engine {
    private int moshnyi;
    private String firm;
    public Engine(){}
    public Engine(int mosh,String firm){
        this.moshnyi=mosh;
        this.firm=firm;
    }
    public String toString(){return moshnyi+", "+firm;}

    public int getMosh() {
        return moshnyi;
    }

    public void setMosh(int mosh) {
        this.moshnyi = mosh;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }
}
