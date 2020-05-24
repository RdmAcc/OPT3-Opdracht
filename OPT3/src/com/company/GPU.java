package com.company;

class GPU {
    private String GPUname;
    private int memory;

    public GPU(String GPUname, int memory) {
        this.GPUname = GPUname;
        this.memory = memory;
    }

    public String getName() {
        return GPUname;
    }

    public int getMemory() {
        return memory;
    }
}