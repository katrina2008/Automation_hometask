package hometask8;

//
public class Tester {

	public String name;
	public String surname;
	protected double expirienceInYears;
	String englishLevel;
	private double salary;

	// Get, set
	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getSurname() {
		return surname;
	}

	void setSurname(String surname) {
		this.surname = surname;
	}

	double getExpirienceInYears() {
		return expirienceInYears;
	}

	void setExpirienceInYears(double expirienceInYears) {
		this.expirienceInYears = expirienceInYears;
	}

	String getEnglishLevel() {
		return englishLevel;
	}

	void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	// constructors
	public Tester() {
	};

	public Tester(String name) {
		this.name = name;
	}

	public Tester(String name, String surname) {
		this(name);
		this.surname = surname;
	}

	public Tester(String name, String surname, double expirienceInYears) {
		this(name, surname);
		this.expirienceInYears = expirienceInYears;
	}

	// methods

	private double getBonus() {
		System.out.println(salary * 2);
		return salary * 2;
	}

	double getMonthExpirienceInYears() {
		int numberOfMonthes = 12;
		System.out.println(expirienceInYears * 12);
		return expirienceInYears * 12;
	}

	protected void nameSurname() {

		System.out.println(name + " " + surname);
	}

	public void allInformation() {

		System.out.println(name + " " + surname + " " + expirienceInYears + " " + englishLevel + " " + salary);
	}

}
