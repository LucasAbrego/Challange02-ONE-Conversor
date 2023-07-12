package modelo.unidad.peso;

public class QuintalLargo extends UnidadPeso {
	public QuintalLargo() {
		nombre = "Quintal largo";
		nombrePlural = "quintales largos";
		representacion = "lcwt";
	}

	@Override
	public double convertirAReferencia(double valor) {
		return valor * 50802.34544;
	}

	@Override
	public double convertirDesdeReferencia(double valor) {
		return valor / 50802.34544;
	}
}
