package com.testAutomationCoach.cMethods;

public class GuitarraElectrica {
    String marca;
    String color;
    Guitarrista [] famoso;

    public GuitarraElectrica (String marca, String color){
        this.marca = marca;
        this.color = color;
        famoso = new Guitarrista[5];
    }
}
