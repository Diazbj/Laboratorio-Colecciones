package CollectionLab.Ejercicio2.Model;

public class Producto implements Comparable<Producto> {
    private String nombre;
    private String codigo;
    private double precio;


    @Override
    public int compareTo(Producto otroProducto) {
        return this.codigo.compareTo(otroProducto.getCodigo());
    }
    public Producto(String nombre, String codigo, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
