/**
 * Clase Hija (Subclase) que recibe la herencia de la clase abstracta Bicicleta.
 */
public class BicicletaMontana extends Bicicleta {

    //Atributo único solicitado para esta subclase
    private int cantidadSuspensiones;

    //Constructor con los atributos super y los únicos de la subclase
    public BicicletaMontana(String codigo, int anoFrabicacion, double peso, int cantidadSuspensiones) {
        super(codigo, anoFrabicacion, peso);
        this.setSuspensiones(cantidadSuspensiones);
    }

    /*
    Conjunto de métodos getter y setter de los atributos de la subclase
     */
    public int getSuspensiones() {
        return cantidadSuspensiones;
    }

    public void setSuspensiones(int cantidadSuspensiones) {
        this.cantidadSuspensiones = cantidadSuspensiones;
    }

    /*
    Método de la clase abstracta que calcula el coste de la instancia creada de la subclase,
    calculando con los parámetros requeridos por el documento.
     */
    @Override
    public double calcularCostoMantencion() {
        double costo = 30000;
        if (cantidadSuspensiones > 1)
            costo += (costo * 0.15);
        return costo;
    }
}
