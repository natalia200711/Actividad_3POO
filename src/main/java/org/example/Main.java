package org.example;

import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) throws SQLException {
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

        Profesor nuevoProfesor = new Profesor(nombre, apellido, fechaNacimiento, genero, estatura, peso, especialidad, titulo);

        // Agregar el nuevo profesor a la lista
        Profesor.agregarProfesor(nuevoProfesor);

        // Mostrar todos los profesores
        Profesor.mostrarTodos();

        // Guardar en la base de datos si hay una conexión establecida
        Connection connection = ConexionDB.getConnection();
        nuevoProfesor.guardarEnBD(connection);

        scanner.close();
    }
}
