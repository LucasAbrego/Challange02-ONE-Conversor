package modelo.unidad.temperatura;

public class Rankine extends UnidadTemperatura {
	public Rankine() {
		nombre = "Rankine";
		nombrePlural = "grados Rankine";
		representacion = "°R";
	}

	@Override
	public double convertirAReferencia(double valor) {
		return (valor - 491.67) * 5 / 9;
	}

	@Override
	public double convertirDesdeReferencia(double valor) {
		return valor * 9 / 5 + 491.67;
	}
}
