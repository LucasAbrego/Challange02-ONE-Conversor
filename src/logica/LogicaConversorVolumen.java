package logica;

import modelo.Conversor;
import modelo.Unidad;
import modelo.unidad.volumen.*;

public class LogicaConversorVolumen extends Conversor{
	public LogicaConversorVolumen() {
		nombre = "Conversor de volumen";
		icono = "/graficos/iconConversorVolumen.png";
		listaUnidades = new Unidad[] {new Barril(), new CentimetroCubico(), new Galon(), 
				new Litro(), new MetroCubico(), new MilimetroCubico(),new Pinta()};
	}
}
