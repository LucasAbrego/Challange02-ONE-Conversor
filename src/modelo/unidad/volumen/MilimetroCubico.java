package modelo.unidad.volumen;

public class MilimetroCubico extends UnidadVolumen {
    public MilimetroCubico() {
        nombre = "Milímetro cúbico";
        nombrePlural = "milímetros cúbicos";
        representacion = "mm³";
    }

    @Override
    public double convertirAReferencia(double valor) {
        return valor / 1000000;
    }

    @Override
    public double convertirDesdeReferencia(double valor) {
        return valor * 1000000;
    }
}