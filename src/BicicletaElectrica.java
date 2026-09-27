public class BicicletaElectrica extends Bicicleta implements ConGarantiaExtendida {

    private double kilometro;
    private boolean bateriaCertificada;
    private boolean garantiaExtendida;

    public BicicletaElectrica(String codigo, int anoFrabicacion, double peso, double kilometro,
                              boolean bateriaCertificada, boolean garantiaExtendida) {
        super(codigo, anoFrabicacion, peso);
        this.setKilometro(kilometro);
        this.setBateriaCertificada(bateriaCertificada);
    }

    public double getKilometro() {
        return kilometro;
    }

    public void setKilometro(double kilometro) {
        this.kilometro = kilometro;
    }

    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }

    public boolean isGarantiaExtendida() {
        return garantiaExtendida;
    }

    @Override
    public boolean tieneGarantia() {
        return isGarantiaExtendida();
    }

    @Override
    public void activarGarantia() {
        if (!isGarantiaExtendida()) {
            this.garantiaExtendida = true;
        }
    }

    @Override
    public double calcularCostoMantencion() {
        double costo = 45000;
        if (!isBateriaCertificada()) {
           double adicional = costo * 0.25;
           costo += adicional;
        }
        return costo;
    }
}
