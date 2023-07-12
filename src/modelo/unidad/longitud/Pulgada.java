package modelo.unidad.longitud;

public class Pulgada extends UnidadLongitud {
    public Pulgada() {
        nombre = "Pulgada";
        nombrePlural = "pulgadas";
        representacion = "in";
    }

    @Override
    public double convertirAReferencia(double valor) {
        return valor * 0.0254;
    }

    @Override
    public double convertirDesdeReferencia(double valor) {
        return valor / 0.0254;
    }
}