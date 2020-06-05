package com.testAutomationCoach.cMethods;

package mercadoLibre;

public class CrearCuentaML {
    public static void main(String[] args) {
        String firstName = "Pepe";
        String lastName= "Pecas";
        String email = "test@tester.com";
        String password = "Pa$$w0rd";

        navegarURL();
        validarHomePage();
        crearCuenta();
        validarCuentaCreada();

    }

    public void navegarURL(){}
    public void validarHomePage(){}
    public void crearCuenta(String firstName, String lastName, String email, String password){}
    public void validarCuentaCreada(){}
}

