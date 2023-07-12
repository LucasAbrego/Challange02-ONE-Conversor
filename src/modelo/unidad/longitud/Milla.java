package modelo.unidad.longitud;

public class Milla extends UnidadLongitud {
    public Milla() {
        nombre = "Milla";
        nombrePlural = "millas";
        representacion = "mi";
    }

    @Override
    public double convertirAReferencia(double valor) {
        return valor * 1609.344;
    }

    @Override
    public double convertirDesdeReferencia(double valor) {
        return valor / 1609.344;
    }
}