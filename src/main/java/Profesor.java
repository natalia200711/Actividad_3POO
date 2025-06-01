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
}
