package com.testAutomationCoach.cMethods;

public class EjemploGuitarristas {
    public static void main(String [] args){
        Guitarrista [] RockGuitarrista = new Guitarrista[5];
        RockGuitarrista[0] = new Guitarrista( "James Hetfield", "Metallica" );
        RockGuitarrista[1] = new Guitarrista( "Ricardo Amorim", "Moonspell" );
        RockGuitarrista[2] = new Guitarrista( "Dan Donegan", "Disturbed" );
        RockGuitarrista[3] = new Guitarrista( "Adam Jones", "Tool" );

        GuitarraElectrica g = new GuitarraElectrica("Gibson", "Negro");
        g.famoso = RockGuitarrista;

        Guitarrista uno = RockGuitarrista[0];
        for (int i = 0; i < g.famoso.length; i ++){
            Guitarrista actual = g.famoso[i];
            if(actual.equals(uno)){
                System.out.println("El Guitarrista" + uno.nombre + "Toca la Guitarra" + g.marca);
            }
            break;
        }
    }
}
