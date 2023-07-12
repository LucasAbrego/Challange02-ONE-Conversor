package logica;

import modelo.Conversor;
import modelo.Unidad;
import modelo.unidad.moneda.*;

public class LogicaConversorMoneda extends Conversor {
	public LogicaConversorMoneda() {
		nombre = "Conversor de moneda";
		icono = "/graficos/iconConversorMoneda.png";
		listaUnidades = new Unidad[] { new DinarKuwaiti(), new DolarEstadounidense(), 
						new Euro(), new FrancoSuizo(), new PesoArgentino(), new PesoChileno(), 
						new PesoColombiano(), new PesoMexicano(), new PesoUruguayo(),
						new RealBrasilenho(), new SolPeruano(), new YenJapones(), new YuanChino() };
	}
}
