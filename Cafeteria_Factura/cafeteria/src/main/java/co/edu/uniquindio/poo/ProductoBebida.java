package co.edu.uniquindio.poo;

public class ProductoBebida extends Producto {
    
    

    public ProductoBebida (String nombre, double valor) {
        super(nombre, valor);
    }

    @Override
    public double aplicarImpuesto(Producto producto) {
        throw new UnsupportedOperationException("Unimplemented method 'aplicarImpuesto'");
    }
}
