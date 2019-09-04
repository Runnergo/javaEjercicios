
public class Apartament {

	private boolean encenderClimatizacion;
	private int temperaturaClima;
	private boolean conectarAlarma;
	private boolean cafetera;
	private String mensajeVozContestador;
	private int consumoCasa;
	
	public Apartament(boolean encenderClimatizacion, int temperaturaClima, boolean conectarAlarma, boolean cafetera,
			String contestador) {
		super();
		this.encenderClimatizacion = encenderClimatizacion;
		this.temperaturaClima = temperaturaClima;
		this.conectarAlarma = conectarAlarma;
		this.cafetera = cafetera;
		this.mensajeVozContestador = contestador;
		this.consumoCasa = 0;
	}
	
	public int consumoCasa() {
		consumoCasa=0;
		if (this.encenderClimatizacion) {
			this.consumoCasa += 2000;
		}
		if (this.conectarAlarma) {
			this.consumoCasa += 100;
		}
		if (this.cafetera) {
			this.consumoCasa += 720;
		}
		return consumoCasa;
	}
	
	public boolean isEncenderClimatizacion() {
		return encenderClimatizacion;
	}
	public void setEncenderClimatizacion(boolean encenderClimatizacion) {
		this.encenderClimatizacion = encenderClimatizacion;
	}
	public int getTemperaturaClima() {
		return temperaturaClima;
	}
	public void setTemperaturaClima(int temperaturaClima) {
		this.temperaturaClima = temperaturaClima;
	}
	public boolean isConectarAlarma() {
		return conectarAlarma;
	}
	public void setConectarAlarma(boolean conectarAlarma) {
		this.conectarAlarma = conectarAlarma;
	}
	public boolean isCafetera() {
		return cafetera;
	}
	public void setCafetera(boolean cafetera) {
		this.cafetera = cafetera;
	}

	public String getMensajeVozContestador() {
		return mensajeVozContestador;
	}

	public void setMensajeVozContestador(String mensajeVozContestador) {
		this.mensajeVozContestador = mensajeVozContestador;
	}

}
