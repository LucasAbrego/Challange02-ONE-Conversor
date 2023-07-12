package modelo.unidad.volumen;

public class Pinta extends UnidadVolumen {
    public Pinta() {
        nombre = "Pinta";
        nombrePlural = "Pintas";
        representacion = "pt";
    }

    @Override
    public double convertirAReferencia(double valor) {
        return valor * 0.473176;
    }

    @Override
    public double convertirDesdeReferencia(double valor) {
        return valor / 0.473176;
    }
}