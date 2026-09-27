/**
 * Interfaz creada según la solicitud del documento
 */
public interface ConGarantiaExtendida {

    /*
    Métodos de la interfaz:
    tieneGarantia: Muestra el estado de la garantía con un booleano
    activarGarantia: Cambia el estado de la garantía si "tieneGarantia" devuelve false
     */
    boolean tieneGarantia();
    void activarGarantia();
}
