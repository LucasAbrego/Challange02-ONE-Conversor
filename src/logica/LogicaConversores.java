package logica;

import modelo.Conversor;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class LogicaConversores {
	private Conversor[] listaConversores = new Conversor[] { 
			(Conversor) new LogicaConversorLongitud(),
			(Conversor) new LogicaConversorMoneda(),
			(Conversor) new LogicaConversorPeso(), 
			(Conversor) new LogicaConversorTemperatura(),
			(Conversor) new LogicaConversorVolumen()};

	public Conversor[] getListaConversores() {
		return listaConversores;
	}

	public Conversor determinarConversorSeleccionado(String nombreConversorSeleccionado) {
		Conversor conversorSeleccionado = null;
		for (int i = 0; i < listaConversores.length; i++) {
			if (listaConversores[i].getNombre().equals(nombreConversorSeleccionado)) {
				conversorSeleccionado = listaConversores[i];
			}
		}
		return conversorSeleccionado;
	}

	public String redondearResultadoDosCifras(double resultado) {
		DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
		decimalFormatSymbols.setDecimalSeparator('.');
		DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
		return decimalFormat.format(resultado);
	}
	
	public String redondearResultadoDiezCifras(double resultado) {
		DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
		decimalFormatSymbols.setDecimalSeparator('.');
		DecimalFormat decimalFormat = new DecimalFormat("#.##########", decimalFormatSymbols);
		return decimalFormat.format(resultado);
	}
}
