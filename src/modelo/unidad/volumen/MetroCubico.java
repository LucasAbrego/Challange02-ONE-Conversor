package modelo.unidad.volumen;

public class MetroCubico extends UnidadVolumen {
    public MetroCubico() {
        nombre = "Metro cúbico";
        nombrePlural = "metros cúbicos";
        representacion = "m³";
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