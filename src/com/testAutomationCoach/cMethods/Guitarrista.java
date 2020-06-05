package com.testAutomationCoach.cMethods;

public class Guitarrista {
    String nombre;
    String banda;

    public Guitarrista (String nombre, String banda)
    {
        this.nombre= nombre;
        this.banda= banda;
    }

    public boolean equals(Guitarrista g){
        return this.banda.equals(g.banda) && this.banda.equals(g.banda);
    }
}
