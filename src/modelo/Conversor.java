package modelo;

import javax.swing.ImageIcon;

import modelo.Unidad;
import vista.VentanaPrincipal;

public abstract class Conversor {
	protected String nombre;
	protected Unidad[] listaUnidades;
	protected String icono;

	public String getIcono() {
		return icono;
	}

	public Unidad[] getListaUnidades() {
		return listaUnidades;
	}

	public String getNombre() {
		return nombre;
	}

	public Unidad determinarUnidadSeleccionada(int indiceUnidadSeleccionada) {
		return listaUnidades[indiceUnidadSeleccionada];
	}

	public double convertirValor(Double valor, Unidad unidadEntrada, Unidad unidadSalida) {
		return unidadSalida.convertirDesdeReferencia(unidadEntrada.convertirAReferencia(valor));
	}
}
