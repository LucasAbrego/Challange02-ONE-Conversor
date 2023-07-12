package modelo.unidad.longitud;

public class Metro extends UnidadLongitud {
    public Metro() {
        nombre = "Metro";
        nombrePlural = "metros";
        representacion = "m";
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
