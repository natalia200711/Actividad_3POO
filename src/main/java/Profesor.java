public class Profesor extends Persona {
    private String especialidad;
    private String titulo;

    public Profesor(String nombre, String apellido, String fechaNacimiento, String genero, double estatura, double peso,
                    String especialidad, String titulo) {
        super(nombre, apellido, fechaNacimiento, genero, estatura, peso); // llamada al constructor de la clase padre
        this.especialidad = especialidad;
        this.titulo = titulo;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // llamada a método de la clase padre
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Título: " + titulo);
    }

    private static Profesor[] listaProfesores = new Profesor[50];
    private static int contador = 0;

    public static void agregarProfesor(Profesor p) {
        if (contador < listaProfesores.length) {
            listaProfesores[contador] = p;
            contador++;
        } else {
            System.out.println("No se pueden agregar más profesores. Límite alcanzado.");
        }
    }

    public static void mostrarTodos() {
        for (int i = 0; i < contador; i++) {
            listaProfesores[i].mostrarInfo();
        }
    }
}

public void guardarEnBD(Connection connection) {
    String sql = "INSERT INTO profesores (nombre, apellido, fechaNacimiento, genero, estatura, peso, especialidad, titulo) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
        stmt.setString(1, nombre);
        stmt.setString(2, apellido);
        stmt.setString(3, fechaNacimiento);
        stmt.setString(4, genero);
        stmt.setDouble(5, estatura);
        stmt.setDouble(6, peso);
        stmt.setString(7, especialidad);
        stmt.setString(8, titulo);
        stmt.executeUpdate();
    } catch (SQLException e) {
        System.err.println("Error al guardar el profesor en la base de datos: " + e.getMessage());
    }
}
