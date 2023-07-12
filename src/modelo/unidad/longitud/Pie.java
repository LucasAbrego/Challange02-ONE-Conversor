package modelo.unidad.longitud;

public class Pie extends UnidadLongitud {
    public Pie() {
        nombre = "Pie";
        nombrePlural = "pies";
        representacion = "ft";
    }

    @Override
    public double convertirAReferencia(double valor) {
        return valor * 0.3048;
    }

    @Override
    public double convertirDesdeReferencia(double valor) {
        return valor / 0.3048;
    }
}
