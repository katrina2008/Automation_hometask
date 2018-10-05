package hometask_3;

import java.util.Scanner;

public class Task3_4 {

	  public static double cube(double a) {
		  double result = Math.pow(a, 3);
	        return result;
	    }

	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        System.out.println("¬ведите число:");
	        double a = scanner.nextDouble();
	        
	        System.out.println(cube(a));
	    }
	}