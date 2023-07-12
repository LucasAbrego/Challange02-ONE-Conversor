package modelo.unidad.peso;

public class Libra extends UnidadPeso {
	public Libra() {
		nombre = "Libra";
		nombrePlural = "libras";
		representacion = "lb";
	}

	@Override
	public double convertirAReferencia(double valor) {
		return valor * 453.59237;
	}

	@Override
	public double convertirDesdeReferencia(double valor) {
		return valor / 453.59237;
	}
}