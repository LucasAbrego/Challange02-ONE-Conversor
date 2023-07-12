package modelo.unidad.volumen;

public class Litro extends UnidadVolumen {
    public Litro() {
        nombre = "Litro";
        nombrePlural = "litros";
        representacion = "L";
    }

    @Override
    public double convertirAReferencia(double valor) {
        return valor;
    }

    @Override
    public double convertirDesdeReferencia(double valor) {
        return valor;
    }
}