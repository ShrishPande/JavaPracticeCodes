package nestedIf;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your First Number");
		double a = sc.nextDouble();
		
		System.out.println("Enter Your Second Number");
		double b = sc.nextDouble();
		
		System.out.println("Enter Your Operation + ,- , * , /");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		
		double result = 0;
		
		switch(operation) {
		
		case '+':
			result = a + b;
			break;
			
		case '-':
			result = a - b;
			break;
			
		case '*':
			result = a * b;
			break;
			
		case '/':
			result = a / b;
			break;
		
		default:
			System.out.println("Enter a valid operation +, - , * or /");
		}
		
		System.out.println("the result is " + result);
		
	}

}
