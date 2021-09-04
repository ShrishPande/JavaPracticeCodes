package forLoop;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		
//		for(int i=0; i<100;i++) {
//			
//			if(i==36 ) {
//				break;
//			}
//			System.out.println(i);
//		}
//		
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			int n= sc.nextInt();
			
			if(n<0) break;
		}
	}

}
