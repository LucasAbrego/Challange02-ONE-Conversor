package modelo.unidad.longitud;

public class KilometroMaritimo extends UnidadLongitud {
    public KilometroMaritimo() {
        nombre = "Kilómetro marítimo";
        nombrePlural = "kilómetros marítimos";
        representacion = "km";
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