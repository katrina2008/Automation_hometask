package hometask4;

public class PersonMain {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Ваня");
		person.setSurname("Иванов");
		person.setAge(25);
		person.setPhone(789456);
		person.printAllInformation();
		person.printName();
		person.isAdult();

	}

}