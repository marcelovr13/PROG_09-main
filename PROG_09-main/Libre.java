import java.util.Arrays;

public class Libre extends Alumno{

    private float precio_hora = 10;
    private int numeroHorasDiarias;


    public Libre(String nombre, int edad, int curso, String nivelAcademico, String[] listaAsignaturas, float precio_hora, int numeroHorasDiarias) {
        super(nombre, edad, curso, nivelAcademico, listaAsignaturas);
        this.precio_hora = precio_hora;
        this.numeroHorasDiarias = numeroHorasDiarias;
    }

    public float getPrecio_hora() {
        return precio_hora;
    }

    public void setPrecio_hora(float precio_hora) {
        this.precio_hora = precio_hora;
    }

    public int getNumeroHorasDiarias() {
        return numeroHorasDiarias;
    }

    public void setNumeroHorasDiarias(int numeroHorasDiarias) {
        this.numeroHorasDiarias = numeroHorasDiarias;
    }

    @Override
    public double pagoMensual() {
        return precio_hora*numeroHorasDiarias*30;
    }

    @Override
    public String mostrarAsignaturas() {
        return "El estudiante libre " + getNombre() + " cursa " + Arrays.toString(getListaAsignaturas());
    }


}
