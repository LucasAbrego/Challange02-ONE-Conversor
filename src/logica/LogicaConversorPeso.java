package logica;

import modelo.Conversor;
import modelo.Unidad;
import modelo.unidad.peso.*;

public class LogicaConversorPeso extends Conversor{
	public LogicaConversorPeso() {
		nombre = "Conversor de peso";
		icono = "/graficos/iconConversorPeso.png";
		listaUnidades = new Unidad[] {new Dracma(), new Gramo(),
						new Kilogramo(), new Libra(), new Miligramo(), 
						new Onza(),	new QuintalCorto(), new QuintalLargo(), 
						new QuintalMetrico(), new Stone(), new ToneladaMetrica()};
	}
}
