import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        GestorBicicletas gb = new GestorBicicletas();
        BicicletaElectrica bici1 = new BicicletaElectrica("BIC-E01", 2023,
                22.5, 60, false, false);

        BicicletaElectrica bici2 = new BicicletaElectrica("BIC-E02", 2022,
                24.0, 45, true, false);

        BicicletaMontana bici3 = new BicicletaMontana("BIC-M01", 2021, 13.5, 2);

        BicicletaMontana bici4 = new BicicletaMontana("BIC-M02", 2020, 12.0, 1);

        gb.registrarBicicleta(bici1);
        bici1.activarGarantia();
        gb.registrarBicicleta(bici2);
        gb.registrarBicicleta(bici3);
        gb.registrarBicicleta(bici4);

        System.out.println("\n===== BÚSQUEDA POR CÓDIGO: BIC-E01=====");
        ArrayList<Bicicleta> resultado = gb.buscarPorCodigo("BIC-E01");
        for (Bicicleta b : resultado) {
            BicicletaElectrica be = (BicicletaElectrica) b;
            System.out.println("Tipo: Bicicleta Eléctrica | Código: " + be.getCodigo() + " | Año: " + be.getAnoFrabicacion() + " | Peso: " + be.getPeso() + " kg" +
                    " | Autonomía: " + be.getKilometro() + " km | Batería Certificada: " + (be.isBateriaCertificada() ? "Sí" : "No") + " \n" +
                    "| Garantía Extendida: " + (be.isGarantiaExtendida() ? "Sí" : "No") + " | Costo Mantención: $" + (int) be.calcularCostoMantencion());
        }

        System.out.println("\n===== Listado de Bicicletas =====");
        for (Bicicleta b : gb.getBicicletas()) {
            System.out.println(b);
        }
    }
}
