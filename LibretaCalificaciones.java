public class LibretaCalificaciones {
    private String nombre;
    private double[] notas;
    private int cantidad;

    public LibretaCalificaciones(String nombre) {
        this.nombre = nombre;
        this.notas = new double[10];
        this.cantidad = 0;
    }

    public void agregarNotas(double nota) {
        if (nota > 0.0 && nota < 10.0 && cantidad < notas.length) {
            notas[cantidad] = nota;
            cantidad++;
            System.out.println("nota agregada correctamente");
        } else {
            System.out.println("nota invalida");
        }
    }

    public double obtenerPromedio() {
        if (cantidad == 0) {
            return 0;
        }

        double suma = 0;
        for (int i = 0; i < cantidad; i++) {
            suma = suma += notas[i];
        }

        return suma / cantidad;
    }
}