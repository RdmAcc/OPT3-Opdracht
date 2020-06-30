package com.company;

abstract class Telephone {
    private String brand;
    private String model;

    public Telephone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }

    abstract void Dialing();
    abstract void Connecting();
    abstract void Ending();

    public final void Call(){
        Dialing();
        Connecting();
        Ending();
    }
}

