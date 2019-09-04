import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		// MASCOTA
		Date nacimientoMascota = new Date(2007, 9, 1);
		Mascota animal = new Mascota("Rodolfo", "perro", nacimientoMascota);

		// VACUNAR
		Date fechaVacunado = new Date(2019, 9, 4);
		Vaccine vacuna = new Vaccine("moquillo", fechaVacunado, 1);

		Date fechaVacunado2 = new Date(2017, 9, 4);
		Vaccine vacuna2 = new Vaccine("rabia", fechaVacunado2, 1);

		System.out.println(animal);

		animal.addVacuna(vacuna);
		animal.addVacuna(vacuna2);
		animal.printVacunas();
		System.out.println();

		esNecesarioVacuna(animal, vacuna);
		esNecesarioVacuna(animal, vacuna2);

		// ID USER PASS EDAD (MAYOR/MENOR/INCREMENTO)
		Subject notas = new Subject(6, 7, 4, 9);

		Date cumple = new Date(2001, 9, 4);
		Person person = new Person("pepe", "gordillo", 29040, cumple);
		Student estudiante = new Student();
		estudiante.addStudent(person);

		//datosUser(estudiante);
		System.out.println("----------------------------------------");
		System.out.println("incrementamos un año");
		cumple.incrementarEdad();
		
		System.out.println(estudiante.getNombre());

		//datosUser(estudiante);
		System.out.println("----------------------------------------");
		estudiante.addNotasStudent(notas);
		estudiante.printNotas();
		estudiante.printStudent();

		/*
		 * // APARTAMENTO
		 * System.out.println("----------------------------------------"); Apartament
		 * casa = new Apartament(true, 22, true, true, "hola como estas");
		 * cosumoCasa(casa); System.out.println("Consumo sin climatizador");
		 * casa.setEncenderClimatizacion(false); cosumoCasa(casa);
		 * System.out.println(casa.getMensajeVozContestador());
		 * casa.setMensajeVozContestador("estoy en casa");
		 * System.out.println(casa.getMensajeVozContestador());
		 */
	}

	public static void esNecesarioVacuna(Mascota animal, Vaccine vacuna) {
		if (animal.proximaVacuna(vacuna)) {
			System.out.println(vacuna);
			System.out.println("Necesitas renovar la vacuna\n");
		} else {
			System.out.println(vacuna);
			System.out.println("Aun no necesita ser vacunado\n");

		}
	}

	public static void mayorOMenorEdad(Person person) {
		if (person.getNacimiento().mayorDeEdad()) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
	}

	public static void datosUser(Student estudiante) {
		System.out.println("----------------------------------------");
		System.out.println("\nUser: " + estudiante.userName());
		System.out.println("Password: " + estudiante.password());
		System.out.println(estudiante);
		mayorOMenorEdad(estudiante);
	}

	public static void cosumoCasa(Apartament casa) {
		System.out.println("El consumo de la casa es " + casa.consumoCasa() + " Wh");
	}
}
