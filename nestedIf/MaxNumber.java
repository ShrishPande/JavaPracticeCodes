package nestedIf;
import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		int thirdNumber = sc.nextInt();
		sc.close();
		
		if(firstNumber>secondNumber) {
			if(firstNumber == thirdNumber) {
				System.out.println("First and Third number are equal and greater than Second");
			}else if(firstNumber>thirdNumber) {
				System.out.println("The highest Number is First Number");
			}else {
				System.out.println("The highest number is Third Number");
			}
		}else if(firstNumber<secondNumber){
			if(secondNumber == thirdNumber) {
				System.out.println("Second and Third number are equal and greater than First");
			}else if(secondNumber>thirdNumber) {
				System.out.println("The highest number is Second Number");
			}else {
				System.out.println("The highest number is Third Number");
			}
		}else {
			if(firstNumber == thirdNumber) {
				System.out.println("All numbers are equal");
			}else if(firstNumber>thirdNumber) {
				System.out.println("First and Second number are equal and greater than Third Number");
			}else {
				System.out.println("The highest number is Third Number");
			}
		}

	}

}
