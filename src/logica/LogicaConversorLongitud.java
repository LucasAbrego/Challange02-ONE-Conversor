package logica;

import modelo.Conversor;
import modelo.Unidad;
import modelo.unidad.longitud.*;

public class LogicaConversorLongitud extends Conversor{
	public LogicaConversorLongitud() {
		nombre = "Conversor de logitud";
		listaUnidades = new Unidad[] {new Centimetro(), new Kilometro(), 
				new KilometroMaritimo(), new Metro(), new Milimetro(), new Milla(), 
				new MillaNautica(), new Pie(), new Pulgada(), new Yarda()};
		icono = "/graficos/iconConversorLongitud.png";
	}
}
