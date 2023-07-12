package modelo.unidad.temperatura;

public class Kelvin extends UnidadTemperatura {
	public Kelvin() {
		nombre = "Kelvin";
		nombrePlural = "grados Kelvin";
		representacion = "K";
	}

	@Override
	public double convertirAReferencia(double valor) {
		return valor - 273.15;
	}

	@Override
	public double convertirDesdeReferencia(double valor) {
		return valor + 273.15;
	}
}
