import java.util.ArrayList;

public class Student extends Person {
    
	private ArrayList<Subject> notas;
	private ArrayList<Person> person;
	
	public Student() {
		this.notas = new ArrayList<Subject>();
		this.person = new ArrayList<Person>();
	}

	public ArrayList getNotas() {
		return notas;		
	}
	public void addNotasStudent(Subject notas) {
		this.notas.add(notas);
	}
	public void printNotas() {
		for (Subject list: notas) {
			System.out.println(list);
		}
	}
	public void addStudent(Person person) {
		this.person.add(person);
	}
	public void printStudent() {
		for (Person list: person) {
			System.out.println(list);
		}
	}
	
	public String userName() {
		String user =super.getNombre().substring(0, 1) + "_" + super.getApellido().substring(0, 1);
		return user.toUpperCase();
	}

	public int password() {
		int temp = 0;
		for (int i = 0; i < super.getNombre().length(); i++) {
			temp += super.getNombre().codePointAt(i)
					+ super.getApellido().codePointAt(i);
		}
		String pass = Integer.toString(temp * super.getId());
		int password = Integer.parseInt(pass.substring(0, 4));

		return password;
	}

}

