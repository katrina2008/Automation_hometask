package hometask5;

public class Tester {
	
	String name;
	String surname;
	double expirienceInYears;
	String englishLevel;
	double salary;
	
	public Tester () {};
	public Tester (String name) 
	{
		this.name = name;
	}
	
	public Tester (String name, String surname) 
	{
		this(name);
		this.surname = surname;
	}
	
	public Tester (String name, String surname, double expirienceInYears ) 
	{
		this(name, surname);
		this.expirienceInYears = expirienceInYears;
	}
	
	public double getBonus (double salary)
	{
	return 0.2 * salary;	
	}
	
	public String getBonus (String name, String surname)
	{
	return (name + " " + surname);	
	}
	
	public String getBonus (String name, String surname, double expirienceInYears)
	{
	return (name + " " + surname + " " + expirienceInYears);	
	}
	
	public static String getEnglishLevel  (String level)
	{
		return level;
	}
	}






	


