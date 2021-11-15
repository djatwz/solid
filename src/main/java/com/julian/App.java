package com.julian;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        Estudiante estudiante = new Estudiante("Pedro");
        DeportistaCorredor deportista = new DeportistaCorredor("Juan");
        DeportistaDeNatacion deportista2 = new DeportistaDeNatacion("Pablo");

        estudiante.setEdad(20);
        estudiante.setCarrera("ing software");

        deportista.setEdad(25);
        deportista2.setEdad(23);

        listaPersonas.add(estudiante);
        listaPersonas.add(deportista);
        listaPersonas.add(deportista2);

        imprimirListaPersonas(listaPersonas);
    }

    static void imprimirListaPersonas(ArrayList<Persona> listaDePersonas){
        for (Persona persona : listaDePersonas) {
            System.out.println(persona.toString());
        }
    }
}

class Persona {  
    String nombre;
    int edad;

    Persona(String nombre) { 
        this.nombre = nombre; 
    }
    
    void setNombre(String newNombre){
        this.nombre = newNombre;
    }

    String getNombre(){
        return this.nombre; 
    }
    
    void setEdad(int newEdad){
        this.edad = newEdad;
    }

    int getEdad(){
        return this.edad; 
    }
}

interface Nadador {
    void nadar();
}

interface Corredor {
    void correr();
}

class Estudiante extends Persona {
    String carrera;

    Estudiante(String nombre) {
        super(nombre);
    }
    
    void setCarrera(String newCarrera){
        this.carrera = newCarrera;
    }

    String getCarrera(){
        return this.carrera; 
    }

    @Override
    public String toString(){
        return "Nombre: "+this.nombre + ", Edad: " + this.edad + ", Carrera: " + this.carrera;
    }
}

class DeportistaDeNatacion  extends Persona implements Nadador{
    DeportistaDeNatacion(String nombre) {
        super(nombre);
    }

    @Override
    public void nadar() {
        System.out.println("Estoy nadando");
    }

    @Override
    public String toString(){
        return "Nombre: "+this.nombre + ", Edad: " + this.edad + " Profesion: nadador";
    }
}

class DeportistaCorredor extends Persona implements Corredor {
    DeportistaCorredor(String nombre) {
        super(nombre);
    }

    @Override
    public void correr() {
        System.out.println("Estoy corriendo");
    }

    @Override
    public String toString(){
        return "Nombre: "+this.nombre + ", Edad: " + this.edad + " Profesion: corredor";
    }
    
}

