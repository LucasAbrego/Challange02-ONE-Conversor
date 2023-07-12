package modelo.unidad.longitud;

public class MillaNautica extends UnidadLongitud {
    public MillaNautica() {
        nombre = "Milla náutica";
        nombrePlural = "millas náuticas";
        representacion = "nm";
    }

    @Override
    public double convertirAReferencia(double valor) {
        return valor * 1852;
    }

    @Override
    public double convertirDesdeReferencia(double valor) {
        return valor / 1852;
    }
}