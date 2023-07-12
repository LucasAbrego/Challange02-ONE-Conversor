package modelo.unidad.peso;

public class Gramo extends UnidadPeso {
	public Gramo() {
		nombre = "Gramo";
		nombrePlural = "gramos";
		representacion = "g";
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
