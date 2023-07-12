package modelo.unidad.peso;

public class QuintalMetrico extends UnidadPeso {
	public QuintalMetrico() {
		nombre = "Quintal métrico";
		nombrePlural = "quintales métricos";
		representacion = "q";
	}

	@Override
	public double convertirAReferencia(double valor) {
		return valor * 100000;
	}

	@Override
	public double convertirDesdeReferencia(double valor) {
		return valor / 100000;
	}
}