package modelo.unidad.peso;

public class Onza extends UnidadPeso {
	public Onza() {
		nombre = "Onza";
		nombrePlural = "onzas";
		representacion = "oz";
	}

	@Override
	public double convertirAReferencia(double valor) {
		return valor * 28.34952;
	}

	@Override
	public double convertirDesdeReferencia(double valor) {
		return valor / 28.34952;
	}
}