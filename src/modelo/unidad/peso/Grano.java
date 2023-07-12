package modelo.unidad.peso;

public class Grano extends UnidadPeso {
	public Grano() {
		nombre = "Grano";
		nombrePlural = "granos";
		representacion = "gr";
	}

	@Override
	public double convertirAReferencia(double valor) {
		return valor * 0.06479891;
	}

	@Override
    public double convertirDesdeReferencia(double valor) {
        return valor / 0.06479891;
    }
}