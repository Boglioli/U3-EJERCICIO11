public class Main {
    public static void main(String[] args) {
        LibretaCalificaciones libreta = new LibretaCalificaciones("Martin");

        libreta.agregarNotas(7.5);
        libreta.agregarNotas(8.0);
        libreta.agregarNotas(9.2);
        libreta.agregarNotas(12.0);

System.out.println("alumno: martin");
        System.out.println("Promedio final: " + libreta.obtenerPromedio());
    }
}
