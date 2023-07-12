package modelo.unidad.longitud;

public class Kilometro extends UnidadLongitud {
    public Kilometro() {
        nombre = "Kilómetro";
        nombrePlural = "kilómetros";
        representacion = "km";
    }

    @Override
    public double convertirAReferencia(double valor) {
        return valor * 1000;
    }

    @Override
    public double convertirDesdeReferencia(double valor) {
        return valor / 1000;
    }
}