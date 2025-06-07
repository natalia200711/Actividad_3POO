package org.example;

import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) throws SQLException {
        // Probar la conexión a la base de datos
        Connection connection = ConexionDB.getConnection();
        if (connection != null) {
            System.out.println("Conexión exitosa a la base de datos.");
        } else {
            System.out.println("Error al conectar con la base de datos.");
            return; // Si no hay conexión, termina la ejecución
        }

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
        double estatura = Double.parseDouble(scanner.nextLine());

        System.out.println("Ingrese el peso del profesor (en kilogramos):");
        double peso = Double.parseDouble(scanner.nextLine());

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
        nuevoProfesor.guardarEnBD(connection);

        scanner.close();
    }
}
