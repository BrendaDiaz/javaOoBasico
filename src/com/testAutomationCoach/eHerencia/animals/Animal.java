package com.testAutomationCoach.eHerencia.animals;

import com.testAutomationCoach.libs.Coordenadas;

import java.io.File;

public class Animal {
	public File picture;
	public char comida; //Carne o Vegetales o ambos
	public int nivelHambre; //1-100
	public String habitat; //selva, bosque, desierto, etc.
	public Coordenadas location;
	
	public void hacerRuido() {}
	public void comer() {}
	public void dormir() {}
	public void recorrerTerreno() {}

}
