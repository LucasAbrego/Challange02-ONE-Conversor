package modelo.unidad.volumen;

public class CentimetroCubico extends UnidadVolumen {
    public CentimetroCubico() {
        nombre = "Centímetro cúbico";
        nombrePlural = "centímetros cúbicos";
        representacion = "cm³";
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