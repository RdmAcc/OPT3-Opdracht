package com.company;

public class TelephoneFactory {

    GPU gpu = new GPU("SnapDragon",4);
    Processor processor = new Processor("Snapdragon",3400);

    public Telephone getTelephone(String telephoneType) {
        if (telephoneType == null)
            return null;

        else if(telephoneType.equalsIgnoreCase("Smartphone"))
            return new Smartphone("Samsung", "S8", "Android 10", gpu, processor);

        else if(telephoneType.equalsIgnoreCase("DesktopTelephone"))
            return new DesktopTelephone("Sony","X1900",2);

        return null;

    }
}