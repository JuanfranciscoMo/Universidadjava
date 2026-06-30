package morales.com.Ventas;

public class Orden {
    private final int idOrden;
    private Producto[] productos;
    private  int contadorProuctos;
    private static final int MAX_PRODUCTOS = 10;
    private static int contadorOrdenes;

    public Orden(){
        this.idOrden = ++morales.com.Ventas.Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if(this.contadorProuctos < Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProuctos++] = producto;
        } else {
            System.out.println("Se ha superado el máximo de productos: "
            + Orden.MAX_PRODUCTOS);

        }

    }

    public double calcularTotal(){
        double total = 0;
        for (var i = 0; i < this.contadorProuctos; i++){
            var productos = this.productos[i];
            total += productos.getPrecio(); // total = total + producto.getPrecio()
        }
        return total;
    }

//    public void mostrarOrden(){
//        System.out.println("Id Orden: " + this.idOrden);
//        var totalOrden = this.calcularTotal();
//        System.out.println("\tTotal de la Orden: $" + totalOrden);
//        System.out.println("\tProductos de la Orden: ");
//        for (var i = 0; i < this.contadorProuctos; i++){
//            System.out.println("\t\t" + this.productos[i]);
//        }
//    }

    @Override
    public String toString(){
        var resultado = "Id Orden: " + this.idOrden + "\n";
        var totalOrden = this.calcularTotal();
         resultado += "\tTotal de la Orden: $" + totalOrden;
        resultado += "\tProductos de la Orden: ";
        for (var i = 0; i < this.contadorProuctos; i++){
            resultado += "\t\t" + this.productos[i] + "\n";
        }
        return resultado;
    }
}
