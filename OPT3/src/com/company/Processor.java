package com.company;

class Processor {
    private String processorName;
    private int clockSpeed;

    public Processor(String processorName, int clockSpeed) {
        this.processorName = processorName;
        this.clockSpeed = clockSpeed;
    }

    public String getName() {
        return processorName;
    }

    public int getClockSpeed() {
        return clockSpeed;
    }
}