package modelo.unidad.peso;

public class Dracma extends UnidadPeso {
	public Dracma() {
		nombre = "Dracma";
		nombrePlural = "dracmas";
		representacion = "dram";
	}

	@Override
	public double convertirAReferencia(double valor) {
		return valor * 1.7718451953125;
	}

	@Override
	public double convertirDesdeReferencia(double valor) {
		return valor / 1.7718451953125;
	}
}