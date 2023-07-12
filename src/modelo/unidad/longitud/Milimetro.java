package modelo.unidad.longitud;

public class Milimetro extends UnidadLongitud {
    public Milimetro() {
        nombre = "Milímetro";
        nombrePlural = "Milímetros";
        representacion = "mm";
    }

    @Override
    public double convertirAReferencia(double valor) {
        return valor / 1000;
    }

    @Override
    public double convertirDesdeReferencia(double valor) {
        return valor * 1000;
    }
}