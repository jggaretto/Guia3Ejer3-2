/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ejer3.pkg2;


public class Auto {
   
    private String color;
    private String patente;
    private int combustible;
    private Rueda[] ruedas;

    public Auto(String color, String patente) {
        this.color = color;
        this.patente = patente;
        this.combustible = 50;
        this.ruedas = new Rueda[4];
        this.ruedas[0] = new Rueda("Delantera izquierda");
        this.ruedas[1] = new Rueda("Delantera derecha");
        this.ruedas[2] = new Rueda("Trasera izquierda");
        this.ruedas[3] = new Rueda("Trasera derecha");
    }

    public void avanzar(int metros) {
        int consumo = metros / 10;
        if (consumo <= combustible) {
            this.combustible -= consumo;
            System.out.println("El auto avanzó " + metros + " metros. Combustible restante: " + combustible + " lts.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar esa distancia.");
        }
    }

    public void retroceder(int metros) {
        int consumo = metros / 10;
        if (consumo <= combustible) {
            combustible -= consumo;
            System.out.println("El auto retrocedió " + metros + " metros. Combustible restante: " + combustible + " lts.");
        } else {
            System.out.println("No hay suficiente combustible para retroceder esa distancia.");
        }
    }

    public void llenarTanque() {
        combustible = 50;
        System.out.println("Se ha llenado el tanque del auto.");
    }

    public void inflarRuedas() {
        for (Rueda rueda : ruedas) {
            rueda.inflar();
        }
    }

    public void pincharRueda(int numeroRueda) {
        ruedas[numeroRueda].pinchar();
    }

    public void desinflarRueda() {//dentro del parentesis tendria que ir lo siguiente: int numeroRueda.
//Lo de abajo es alternativo para simplemente desinflar cada rueda individualmente       
//ruedas[numeroRueda].desinflar();
//lo mismo se puede agregar y cambiar dentro de los metodos: inflarRuedas y pinchaRueda.
        for (Rueda rueda : ruedas) {
            rueda.desinflar();
        }
    }

    
}

