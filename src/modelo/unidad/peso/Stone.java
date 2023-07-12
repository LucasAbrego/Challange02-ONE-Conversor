package modelo.unidad.peso;

public class Stone extends UnidadPeso {
	public Stone() {
		nombre = "Stone";
		nombrePlural = "stones";
		representacion = "st";
	}

	@Override
	public double convertirAReferencia(double valor) {
		return valor * 6350.29318;
	}

	@Override
	public double convertirDesdeReferencia(double valor) {
		return valor / 6350.29318;
	}
}
