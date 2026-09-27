/**
 * Clase gestor Bicicletas que interactúa con las clases y objetos creados
 */

import java.util.ArrayList;

public class GestorBicicletas {

    // Creación de la lista de elementos
    private ArrayList<Bicicleta> bicicletas = new ArrayList<>();

    /*
    Este método se encarga de registar las bicicletas creadas e instanciadas en el main
    y almacenarlas en una lista, haciendo print que valida que el objeto se almacenó correctamente.
     */
    public void registrarBicicleta(Bicicleta bicicleta) {
        bicicletas.add(bicicleta);
        String codigo = bicicleta.getCodigo();
        System.out.println(codigo + " (" + bicicleta.getClass().getSimpleName() + ") registrada correctamente.");
    }

    /*
    Método get que devuelve la lista creada con todas las bicicletas registradas.
     */
    public ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    /*
    Método que tiene la tarea que buscar por código las bicicletas registradas en el sistema,
    almacena el objeto encontrado con el parámetro de búsqueda y
    muestra en la terminal todos sus atributos
     */
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
