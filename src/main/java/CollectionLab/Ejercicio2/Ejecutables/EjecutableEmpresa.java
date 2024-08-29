package CollectionLab.Ejercicio2.Ejecutables;

import CollectionLab.Ejercicio2.Model.Empresa;
import CollectionLab.Ejercicio2.Model.Producto;

import java.util.TreeSet;

public class EjecutableEmpresa {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        TreeSet<Producto> productos = new TreeSet<>();

        Producto producto1=new Producto("Carne","1100",15800);
        Producto producto2=new Producto("Leche","2200",4500);
        Producto producto3=new Producto("Cereal","4400",7900);
        Producto producto4=new Producto("Pan","3300",2000);

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);

        imprimirListaProductos(productos);

        String codigoBuscar="2200";

        empresa.buscarProducto(codigoBuscar,productos);



    }

    public static void imprimirListaProductos(TreeSet<Producto> productos){
        for(Producto producto:productos){
            System.out.println(producto.getNombre());
        }
    }
}
