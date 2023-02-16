package org.example;

public class Animal {

   private String nombre;
   private String genero;
    private double peso;
    private Animal pareja;

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public double getPeso() {
        return peso;
    }

    public Animal getPareja() {
        return pareja;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public void setGenero(String genero) {
        if(genero == "M" || genero == "F"){
        this.genero = genero;}else{
        System.out.println("Ingrese el genero correcto M=macho/F=hembra");}
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPareja(Animal pareja) {
        this.pareja = pareja;
    }

    public Animal(String nombre, double peso, Animal pareja, String genero) {
        this.nombre = nombre;
        this.peso = peso;
    }



    public Animal() {
    }

    public void encontrarPareja(Animal pareja){
        this.pareja=pareja;
    }






}
