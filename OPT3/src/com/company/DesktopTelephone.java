package com.company;

class DesktopTelephone extends Telephone {
    private int cableLenght;


    public DesktopTelephone(String brand, String model, int cableLenght) {
        super(brand, model);
        this.cableLenght = cableLenght;
    }

    public int getCableLenght() {
        return cableLenght;
    }
    @Override
    public void call(){
        System.out.println("Desktop telephone is calling...");
    }
}