package modelo.unidad.peso;

public class Kilogramo extends UnidadPeso {
	public Kilogramo() {
		nombre = "Kilogramo";
		nombrePlural = "kilogramos";
		representacion = "kg";
	}

	@Override
	public double convertirAReferencia(double valor) {
		return valor * 1000;
	}

	@Override
	public double convertirDesdeReferencia(double valor) {
		return valor / 1000;
	}
}
