public class BicicletaMontana extends Bicicleta {

    private int cantidadSuspensiones;

    public BicicletaMontana(String codigo, int anoFrabicacion, double peso, int cantidadSuspensiones) {
        super(codigo, anoFrabicacion, peso);
        this.setSuspensiones(cantidadSuspensiones);
    }

    public int getSuspensiones() {
        return cantidadSuspensiones;
    }

    public void setSuspensiones(int cantidadSuspensiones) {
        this.cantidadSuspensiones = cantidadSuspensiones;
    }

    @Override
    public double calcularCostoMantencion() {
        double costo = 30000;
        if (cantidadSuspensiones > 1)
            costo += (costo * 0.15);
        return costo;
    }
}
