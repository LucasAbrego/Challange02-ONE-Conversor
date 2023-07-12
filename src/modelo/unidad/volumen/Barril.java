package modelo.unidad.volumen;

public class Barril extends UnidadVolumen {
    public Barril() {
        nombre = "Barril";
        nombrePlural = "barriles";
        representacion = "bbl";
    }

    @Override
    public double convertirAReferencia(double valor) {
        return valor * 158.987;
    }

    @Override
    public double convertirDesdeReferencia(double valor) {
        return valor / 158.987;
    }
}
