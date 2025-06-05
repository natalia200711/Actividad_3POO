package org.example;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected String fechaNacimiento;
    protected String genero;
    protected double estatura;
    protected double peso;

    public Persona(String nombre, String apellido, String fechaNacimiento, String genero, double estatura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.estatura = estatura;
        this.peso = peso;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Género: " + genero);
        System.out.println("Estatura: " + estatura + " m");
        System.out.println("Peso: " + peso + " kg");
    }
}