package modelo.unidad.volumen;

public class Galon extends UnidadVolumen {
    public Galon() {
        nombre = "Galón";
        nombrePlural = "galones";
        representacion = "gal";
    }

    @Override
    public double convertirAReferencia(double valor) {
        return valor * 3.78541;
    }

    @Override
    public double convertirDesdeReferencia(double valor) {
        return valor / 3.78541;
    }
}

