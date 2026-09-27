/**
 * Clase principal (abstracta) que tiene los atributos base de las subclases BicicletaElectrica y BicicletaMontana
 */
public abstract class Bicicleta {

    //Atributos base que tendrán todos los objetos creados en las subclases que reciban la herencia
    private String codigo;
    private int anoFrabicacion;
    private double peso;

    //Constructor para la clase abstracta que recibe los parámetros de los métodos setter
    public Bicicleta(String codigo, int anoFrabicacion, double peso) {
        this.setCodigo(codigo);
        this.setAnoFrabicacion(anoFrabicacion);
        this.setPeso(peso);
    }

    /*
    Conjunto de métodos getter y setter de los atributos base
     */
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        //Validación de excepciones para que el código devuelto no sea nulo ni esté vacío
        if (codigo == null) {
            throw new IllegalArgumentException("El codigo no puede ser nulo");
        }

        if (codigo.isEmpty()) {
            throw new IllegalArgumentException("El codigo no puede ser vacio");
        }

        if (codigo.equals(" ")) {
            throw new IllegalArgumentException("El codigo no puede ser vacio");
        }

        this.codigo = codigo;
    }

    public int getAnoFrabicacion() {
        return anoFrabicacion;
    }

    public void setAnoFrabicacion(int anoFrabicacion) {
        //Validación de excepción para que el año de fabricación esté dentro del rango establecido
        if (anoFrabicacion > 2026 || anoFrabicacion < 2000) {
            throw new IllegalArgumentException("El año de la bicicleta está fuera de rango.");
        }
        this.anoFrabicacion = anoFrabicacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        //Validación de excepción para que el peso esté en el rango establecido
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso no puede ser menor que 0");
        }
        this.peso = peso;
    }

    /*
    Método abstracto que calcula el costo de mantención de los objetos creados de las subclases
    con sus respectivos parámetros dados por las clases hijas
     */
    public abstract double calcularCostoMantencion();

    /*
    Método toString que muestra el listado de los objetos registrados
     */
    @Override
    public String toString() {
        return ("Código: "+codigo + " | " + "Año: "+anoFrabicacion);
    }
}
