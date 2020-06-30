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
    void Dialing(){
        System.out.println("Desktop telephone is dialing a number");
    }
    @Override
    void Connecting(){
        System.out.println("Desktop telephone is connecting... \nConnected");
    }
    @Override
    void Ending(){
        System.out.println("Desktop telephone call has ended");
    }
}