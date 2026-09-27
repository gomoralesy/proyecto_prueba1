/**
 * Clase Hija (Subclase) que recibe la herencia de la clase abstracta Bicicleta e implementa la interfaz requerida
 * en el documento.
 */
public class BicicletaElectrica extends Bicicleta implements ConGarantiaExtendida {

    //Atributos únicos solicitados para esta subclase
    private double kilometro;
    private boolean bateriaCertificada;
    private boolean garantiaExtendida;

    //Constructor con los atributos super y los únicos de la subclase
    public BicicletaElectrica(String codigo, int anoFrabicacion, double peso, double kilometro,
                              boolean bateriaCertificada, boolean garantiaExtendida) {
        super(codigo, anoFrabicacion, peso);
        this.setKilometro(kilometro);
        this.setBateriaCertificada(bateriaCertificada);
    }

    /*
    Conjunto de métodos getter y setter de los atributos de la subclase
     */
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

    /*
    Métodos implementados por la interfez solicitada ConGarantiaExtendida
     */
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

    /*
    Método de la clase abstracta que calcula el coste de la instancia creada de la subclase,
    calculando con los parámetros requeridos por el documento.
     */
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
