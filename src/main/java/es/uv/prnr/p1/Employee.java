package es.uv.prnr.p1;
import java.time.LocalDate;

public class Employee {
	
	private int id;
	private String firstName;
	private String last_name;
	private LocalDate birthDate;
	private LocalDate hireDate;
	private Gender gender;
	
	public enum Gender{
		M,F
	};
	
	public Employee(){
		
	}

	public Employee(int id, String firstName, String lastName, LocalDate birthDate, LocalDate hireDate, Gender gender) {
		this.id = id;
		this.firstName = firstName;
		this.last_name = lastName;
		this.birthDate = birthDate;
		this.hireDate = hireDate;
		this.gender = gender;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return last_name;
	}

	public void setLastName(String lastName) {
		this.last_name = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
