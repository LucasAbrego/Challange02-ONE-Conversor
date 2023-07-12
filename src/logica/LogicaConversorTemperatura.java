package logica;


import modelo.Conversor;
import modelo.Unidad;
import modelo.unidad.temperatura.*;

public class LogicaConversorTemperatura extends Conversor {
	public LogicaConversorTemperatura() {
		nombre = "Conversor de temperatura";
		icono = "/graficos/iconConversorTemperatura.png";
		listaUnidades = new Unidad[] { new Celsius(), new Fahrenheit(), 
						new Kelvin(), new Rankine() };
	}
}
