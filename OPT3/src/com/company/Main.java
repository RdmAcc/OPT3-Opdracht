package com.company;

public class Main {

    public static void main(String[] args) {
        TelephoneFactory telephoneFactory = new TelephoneFactory();

        Telephone smartphone = telephoneFactory.getTelephone("smartphone");
        Telephone desktopTelephone = telephoneFactory.getTelephone("desktoptelephone");

        smartphone.call();
        desktopTelephone.call();
    }
}
//Code smells die in mijn code ontbreekt en hoe ik ze heb opgelost:
//  +large class : refactoring -> Extract Subclass
//  +long method: Elk method 1 responsibility geven
//  +duplicate code: refactoring ->  -Pull Up Field
//                                   -Extract Superclass
