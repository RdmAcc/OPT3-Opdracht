package com.company;

class Smartphone extends Telephone {
    private String software;

    private GPU gpu;
    private Processor processor;

    public Smartphone(String brand, String model, String software, GPU gpu, Processor processor) {
        super(brand, model);
        this.software = software;
        this.gpu = gpu;
        this.processor = processor;
    }

    public String getSoftware() {
        return software;
    }
    @Override
    void Dialing(){
        System.out.println("Smartphone is dialing a number");
    }
    @Override
    void Connecting(){
        System.out.println("Smartphone is connecting... \nConnected");
    }
    @Override
    void Ending(){
        System.out.println("Smartphone call has ended");
    }
}