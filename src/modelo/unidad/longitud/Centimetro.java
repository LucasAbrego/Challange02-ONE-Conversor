package modelo.unidad.longitud;

public class Centimetro extends UnidadLongitud {
    public Centimetro() {
        nombre = "Centímetro";
        nombrePlural = "centímetros";
        representacion = "cm";
    }

    @Override
    public double convertirAReferencia(double valor) {
        return valor / 100;
    }

    @Override
    public double convertirDesdeReferencia(double valor) {
        return valor * 100;
    }
}