package modelo.unidad.longitud;

public class Yarda extends UnidadLongitud {
    public Yarda() {
        nombre = "Yarda";
        nombrePlural = "yardas";
        representacion = "yd";
    }

    @Override
    public double convertirAReferencia(double valor) {
        return valor * 0.9144;
    }

    @Override
    public double convertirDesdeReferencia(double valor) {
        return valor / 0.9144;
    }
}