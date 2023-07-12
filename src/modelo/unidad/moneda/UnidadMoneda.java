package modelo.unidad.moneda;

import modelo.Unidad;

public abstract class UnidadMoneda extends Unidad {
	protected double valorDeUnKWD; // Cotización al 30/06/2023

	public double getValorRespectoAlDinarKawaiti() {
		return valorDeUnKWD;
	}

	@Override
	public double convertirAReferencia(double valor) {
		return valor / this.valorDeUnKWD;
	}

	@Override
	public double convertirDesdeReferencia(double valor) {
		return valor * this.valorDeUnKWD;
	}

}
