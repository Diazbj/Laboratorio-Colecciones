package CollectionLab.Model;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private int edad;
    private String Genero;

    @Override
    public int compareTo(Persona otraPersona) {
//        return Integer.compare(this.edad, otraPersona.edad);
        return this.nombre.compareTo(otraPersona.nombre);
    }
    public Persona(String nombre, int edad, String Genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.Genero = Genero;

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;

    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getGenero() {
        return Genero;
    }
    public void setGenero(String genero) {
        this.Genero = genero;
    }

}
