import java.time.LocalDate;
import java.time.Period;

public class Date {
	private int dia;
	private int mes;
	private int a�o;
	LocalDate fechaActual;
	Period intervalo;
	private int edad;

	public Date(int a�o, int mes, int dia) {
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
		this.fechaActual = LocalDate.now();
		this.intervalo = Period.between(LocalDate.of(a�o, mes, dia), fechaActual);
		this.edad = intervalo.getYears();
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public LocalDate getFechaActual() {
		return fechaActual;
	}

	public void setFechaActual(LocalDate fechaActual) {
		this.fechaActual = fechaActual;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Period getIntervalo() {
		return intervalo;
	}

	public void setIntervalo(Period intervalo) {
		this.intervalo = intervalo;
	}

	public boolean mayorDeEdad() {
		if (edad < 18) {
			return false;
		}
		return true;
	}

	public boolean cumplea�os() {

		if (this.dia == fechaActual.getDayOfMonth() && this.mes == fechaActual.getMonthValue()) {
			return true;
		}
		return false;
	}

	public void incrementarEdad() {
		edad++;
	}

	public String toString() {
		return a�o + "-" + mes + "-" +dia;
	}

	public String proximaVacuna(int a�osDuracionVacuna) {
		return (a�o+a�osDuracionVacuna) + " a�os, " + intervalo.getMonths() + " meses y " + intervalo.getDays() + " dias";
	}

	

}
