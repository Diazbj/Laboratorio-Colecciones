package CollectionLab.Model;

public class Estudiante extends Persona{
    private double matricula;

    public Estudiante(String nombre, int edad, String genero, double matricula) {
        super(nombre,edad,genero);
        this.matricula = matricula;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }
}
