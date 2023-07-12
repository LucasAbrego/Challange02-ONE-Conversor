package modelo.unidad.temperatura;

public class Celsius extends UnidadTemperatura {
	public Celsius() {
		nombre = "Celsius";
		nombrePlural = "grados Celsius";
		representacion = "°C";
	}

	@Override
	public double convertirAReferencia(double valor) {
		return valor;
	}

	@Override
	public double convertirDesdeReferencia(double valor) {
		return valor;
	}
}
