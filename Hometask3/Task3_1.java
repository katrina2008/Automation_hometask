package hometask_3;

	import java.util.Scanner;

	public class Task3_1 {

		  public static double min(double a, double b) {
			  double result = (double) Math.min(a, b);
		        return result;
		    }

		    public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        System.out.println("������� �����1:");
		        double a = scanner.nextDouble();
		        System.out.println("������� �����2:");
		        double b = scanner.nextDouble();

		        System.out.println("����������� �����: " +  min(a, b));
		    }
		}