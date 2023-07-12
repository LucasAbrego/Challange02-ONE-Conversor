package modelo.unidad.temperatura;

public class Fahrenheit extends UnidadTemperatura {
	public Fahrenheit() {
		nombre = "Fahrenheit";
		nombrePlural = "grados Fahrenheit";
		representacion = "°F";
	}

	@Override
	public double convertirAReferencia(double valor) {
		return (valor - 32) * 5 / 9;
	}

	@Override
	public double convertirDesdeReferencia(double valor) {
		return (valor * 9 / 5) + 32;
	}
}
