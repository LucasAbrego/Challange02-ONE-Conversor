package modelo.unidad.peso;

public class ToneladaMetrica extends UnidadPeso {
	public ToneladaMetrica() {
		nombre = "Tonelada métrica";
		nombrePlural = "toneladas métricas";
		representacion = "t";
	}

	@Override
	public double convertirAReferencia(double valor) {
		return valor * 1000000;
	}

	@Override
	public double convertirDesdeReferencia(double valor) {
		return valor / 1000000;
	}
}