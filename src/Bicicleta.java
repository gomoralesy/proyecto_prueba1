public abstract class Bicicleta {

    private String codigo;
    private int anoFrabicacion;
    private double peso;

    public Bicicleta(String codigo, int anoFrabicacion, double peso) {
        this.setCodigo(codigo);
        this.setAnoFrabicacion(anoFrabicacion);
        this.setPeso(peso);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
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
        if (anoFrabicacion > 2026 || anoFrabicacion < 2000) {
            throw new IllegalArgumentException("El año de la bicicleta está fuera de rango.");
        }
        this.anoFrabicacion = anoFrabicacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso no puede ser menor que 0");
        }
        this.peso = peso;
    }

    public abstract double calcularCostoMantencion();

    @Override
    public String toString() {
        return ("Código: "+codigo + " | " + "Año: "+anoFrabicacion);
    }
}
