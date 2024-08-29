package CollectionLab.Ejercicio2.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Empresa {

    TreeSet<Producto> productos = new TreeSet<>();

    public Empresa() {
        this.productos = new TreeSet<>();
    }
    public TreeSet<Producto> getProductos() {
        return productos;
    }
    public void setProductos(TreeSet<Producto> productos) {
        this.productos = productos;

    }


    public void buscarProducto(String codigo, TreeSet<Producto> productos) {
        int i=0;
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                i=1;
                System.out.println("El producto con codigo "+ codigo+" es "+producto.getNombre());
            }

        }
        if (i==0){
            System.out.println("No existe producto con  codigo "+codigo);
        }

    }



}
