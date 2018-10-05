package hometask4;

public class Person {

	private String name;
	private String surname;
	private int age;
	private int phone;

	public void setName(String aa) {
		this.name = aa;
	}

	public void setSurname(String bb) {
		this.surname = bb;
	}

	public void setAge(int cc) {
		this.age = cc;
	}

	public void setPhone(int dd) {
		this.phone = dd;
	}

	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return this.surname;
	}

	public int getAge() {
		return this.age;
	}

	public int getPhone() {
		return this.phone;
	}

	public void printAllInformation()
	{
		System.out.println(name + " " + surname + " " + age  + " "  + phone);
	}

	public void printName ()
	{
		System.out.println(name + " " + surname);
	}
	
	public boolean isAdult () {
	
	if (age > 18) {
		System.out.println(true);
		return true;
	}

	else {
		System.out.println(false);
		return false;
	}
}
}