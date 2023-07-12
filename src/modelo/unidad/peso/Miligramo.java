package modelo.unidad.peso;

public class Miligramo extends UnidadPeso {
	public Miligramo() {
		nombre = "Miligramo";
		nombrePlural = "miligramos";
		representacion = "mg";
	}

	@Override
	public double convertirAReferencia(double valor) {
		return valor / 1000;
	}

	@Override
	public double convertirDesdeReferencia(double valor) {
		return valor * 1000;
	}
}
