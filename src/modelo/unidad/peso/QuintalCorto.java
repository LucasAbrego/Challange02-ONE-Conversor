package modelo.unidad.peso;

public class QuintalCorto extends UnidadPeso {
	public QuintalCorto() {
		nombre = "Quintal corto";
		nombrePlural = "quintales cortos";
		representacion = "cwt";
	}

	@Override
	public double convertirAReferencia(double valor) {
		return valor * 45359.237;
	}

	@Override
	public double convertirDesdeReferencia(double valor) {
		return valor / 45359.237;
	}
}