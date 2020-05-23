package com.company;

class Smartphone extends Telephone {
    private String software;

    public Smartphone(String brand, String model, String software) {
        super(brand, model);
        this.software = software;
    }

    public String getSoftware() {
        return software;
    }
    @Override
    public void call(){
        System.out.println("Smartphone is calling...");
    }
}

