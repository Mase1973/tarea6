package edt6;

public class Descuentos {

    private static final int LIMITE_PARA_HACER_DESCUENTO = 3;
    private static final double DESCUENTO_ALTO = 0.8;
    private static final double DESCUENTO_BAJO = 0.95;

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
        if (numProductos > LIMITE_PARA_HACER_DESCUENTO) {
            precioProducto -= 5;
        }
        if (numProductos != 0) {
            total = precioProducto * DESCUENTO_ALTO;
            mostrarTotal(total);
        } else {
            total = precioProducto * DESCUENTO_BAJO;
            mostrarTotal(total);
        }
    }

    private void mostrarTotal(double total) {
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }
}