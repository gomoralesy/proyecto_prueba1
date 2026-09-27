import java.util.ArrayList;

public class GestorBicicletas {

    private ArrayList<Bicicleta> bicicletas = new ArrayList<>();

    public void registrarBicicleta(Bicicleta bicicleta) {
        bicicletas.add(bicicleta);
        String codigo = bicicleta.getCodigo();
        System.out.println(codigo + " (" + bicicleta.getClass().getSimpleName() + ") registrada correctamente.");
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public ArrayList<Bicicleta> buscarPorCodigo(String codigo) {
        ArrayList<Bicicleta> bicicletasEncontrada = new ArrayList<>();
        for (Bicicleta b : bicicletas) {
            if (codigo.equals(b.getCodigo())) {
                bicicletasEncontrada.add(b);
            }
        }
        if (bicicletasEncontrada.isEmpty()) {
            System.out.println("No se encontraron coincidencias.");
        }
        return bicicletasEncontrada;
    }
}
