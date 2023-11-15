package co.edu.uniquindio.poo;

public class ProductoDulce extends Producto implements InterfaceImpuestos {
    
    private double contenidoAzucar;
    private final double ImpuestoBase;
    private final double ImpuestoAdicional;


    public ProductoDulce(String nombre, double valor, double contenidoAzucar) {
        super(nombre, valor);

        this.contenidoAzucar = contenidoAzucar;
        ImpuestoBase = 0.1;
        ImpuestoAdicional = 0.1;
    }


    public double getContenidoAzucar() {
        return contenidoAzucar;
    }


    public void setContenidoAzucar(double contenidoAzucar) {
        this.contenidoAzucar = contenidoAzucar;
    }


    public double getImpuestoBase() {
        return ImpuestoBase;
    }


    public double getImpuestoAdicional() {
        return ImpuestoAdicional;
    }


    @Override
    public double aplicarImpuesto(Producto producto) {
        double precio = producto.getValor(); // Precio base

        if (producto instanceof ProductoDulce) {  //Producto Dulce
            double impuestoBase = producto.getValor() * ((ProductoDulce) producto).ImpuestoBase;
            precio += impuestoBase;
            
            if (((ProductoDulce) producto).getContenidoAzucar() > 0.5) {
                double impuestoAdicional = producto.getValor() * ((ProductoDulce) producto).ImpuestoAdicional;
                precio += impuestoAdicional;
            }
        }
        return precio;
    }
}
