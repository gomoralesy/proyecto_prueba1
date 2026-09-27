/**
 * Proyecto gesto de bicicletas - Evaluación 1
 *
 * @Author Gonzalo Morales Yáñez
 * @Version 1.0
 *
 * El programa presenta un gestor de bicicletas que muestra objetos cargados automáticamente.
 * Permite buscar el objeto por el atributo código y listar todos los elementos.
 * De momento no está estructurado para ingreso manual de otras bicicletas o elementos.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Creación de la instancia de la clase GestorBicicletas que interactúa con las otras clases.
        GestorBicicletas gb = new GestorBicicletas();

        // Creación de las instancias de los objetos de las clases bicicletas con sus respectivos atributos
        BicicletaElectrica bici1 = new BicicletaElectrica("BIC-E01", 2023,
                22.5, 60, false, false);

        BicicletaElectrica bici2 = new BicicletaElectrica("BIC-E02", 2022,
                24.0, 45, true, false);

        BicicletaMontana bici3 = new BicicletaMontana("BIC-M01", 2021, 13.5, 2);

        BicicletaMontana bici4 = new BicicletaMontana("BIC-M02", 2020, 12.0, 1);

        // Llamamos al método Registrar Bicicleta de la clase Gestor Bicicletas
        gb.registrarBicicleta(bici1);
        bici1.activarGarantia();
        gb.registrarBicicleta(bici2);
        gb.registrarBicicleta(bici3);
        gb.registrarBicicleta(bici4);

        // Llamamos al método buscar por código de la clase gestor bicicletas
        System.out.println("\n===== BÚSQUEDA POR CÓDIGO: BIC-E01=====");
        ArrayList<Bicicleta> resultado = gb.buscarPorCodigo("BIC-E01");
        for (Bicicleta b : resultado) {
            BicicletaElectrica be = (BicicletaElectrica) b;
            System.out.println("Tipo: Bicicleta Eléctrica | Código: " + be.getCodigo() + " | Año: " + be.getAnoFrabicacion() + " | Peso: " + be.getPeso() + " kg" +
                    " | Autonomía: " + be.getKilometro() + " km | Batería Certificada: " + (be.isBateriaCertificada() ? "Sí" : "No") + " \n" +
                    "| Garantía Extendida: " + (be.isGarantiaExtendida() ? "Sí" : "No") + " | Costo Mantención: $" + (int) be.calcularCostoMantencion());
        }

        // Mostramos por terminal el listado de las bicicletas ingresadas
        System.out.println("\n===== Listado de Bicicletas =====");
        for (Bicicleta b : gb.getBicicletas()) {
            System.out.println(b);
        }
    }
}
