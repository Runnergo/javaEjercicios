import java.util.ArrayList;
import java.util.ArrayList;

public class Mascota {

	private String name;
	private String tipoAnimal;
	private Date nacimiento;
	private ArrayList<Vaccine> vacunas;

	public Mascota(String name, String tipoAnimal, Date nacimiento) {

		this.name = name;
		this.tipoAnimal = tipoAnimal;
		this.nacimiento = nacimiento;
		this.vacunas = new ArrayList<Vaccine>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	public void addVacuna(Vaccine vacuna) {

		vacunas.add(vacuna);
	}

	public boolean proximaVacuna(Vaccine vacuna) {
	
		System.out.println(vacuna.getFechaVacunado().fechaActual);
		System.out.println(vacuna.getFechaVacunado());
		System.out.println(vacuna.getRenovarVacuna());
		if (vacuna.getFechaVacunado().equals(vacuna.getFechaVacunado().fechaActual)) {
			return true;
		}
		return false;
	}

	public void printVacunas() {
		System.out.println("Esta vacunado de:");
		for (Vaccine list : vacunas) {
			System.out.println(
					"Nombre: " + list.getNameVacuna() + " (Fecha de vacunacion: " + list.getFechaVacunado() + ")");
		}
	}

	public String toString() {
		return "Mi " + tipoAnimal + " se llama " + name + " nacio el " + nacimiento + " tiene " + nacimiento.getEdad()
				+ " años";
	}

}
