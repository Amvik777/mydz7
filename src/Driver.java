package com.company.professions;

public class Driver {
    private String fio;
    private int stage;
    public Driver(){}
    public Driver (String fio,int stag){
        this.fio=fio;
        this.stage=stag;
    }
    public String toString(){return fio+", "+stage;}

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getStag() {
        return stage;
    }

    public void setStag(int stag) {
        this.stage = stag;
    }
}