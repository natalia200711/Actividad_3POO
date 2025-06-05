package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del profesor:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido del profesor:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la fecha de nacimiento del profesor (DD/MM/AAAA):");
        String fechaNacimiento = scanner.nextLine();

        System.out.println("Ingrese el género del profesor:");
        String genero = scanner.nextLine();

        System.out.println("Ingrese la estatura del profesor (en metros):");
        double estatura = scanner.nextDouble();

        System.out.println("Ingrese el peso del profesor (en kilogramos):");
        double peso = scanner.nextDouble();

        scanner.nextLine(); // Consumir el salto de línea

        System.out.println("Ingrese la especialidad del profesor:");
        String especialidad = scanner.nextLine();

        System.out.println("Ingrese el título del profesor:");
        String titulo = scanner.nextLine();
