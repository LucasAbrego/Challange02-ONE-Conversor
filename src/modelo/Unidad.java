package modelo;

public abstract class Unidad {
	protected String nombre;
	protected String nombrePlural;
	protected String representacion;

	public String getNombre() {
		return nombre;
	}

	public String getNombrePlural() {
		return nombrePlural;
	}

	public String getRepresentacion() {
		return representacion;
	}

	public abstract double convertirAReferencia(double valor);

	public abstract double convertirDesdeReferencia(double valor);
}
