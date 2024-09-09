package CollectionLab.Model;

public class Tarea implements Comparable<Tarea> {

    private String descripcion;
    private int prioridad;
    private int secuencia;

    public Tarea(String descripcion, int prioridad, int secuencia) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.secuencia = secuencia;

    }

    @Override
    public int compareTo(Tarea o) {
        return this.prioridad - o.prioridad;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    public int getSecuencia() {
        return secuencia;
    }
    public void setSecuencia(int secuencia) {
        this.secuencia = secuencia;
    }

}