package simplePrograms;

import java.util.Scanner;

public class FirstJavaClass {

	public static void stringname() {

		String name = "INTO University Partnerships";
		System.out.println(name);

	}

	public static void main(String[] args) {
//		//addition
//		int a=10;
//		int b=20;
//		int c=a+b;
//		System.out.println("c value is a+b ="  + c);
//		
//		//Multiplication
//		
//		int x=19,y=20,z;
//		z=x*y;
//		System.out.println("z value is x*y =" + z);
//		
//		//subtraction
//		
//		double p,q,r;
//		p=200.96;
//		q=700.567;
//		r=q-p;
//		System.out.println("r value is q-p="+r);
//		
//		//even and odd numbers
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter any number : ");
//		
//		int num=scan.nextInt();
//	
//		if(num%2==0) {
//			System.out.print("Number is even");
//		} 
//		else if(num%2==1)
//			  {
//			System.out.println("Number is odd");
//		}else {
//			System.out.println("Something else");
//		}
//	    System.out.println("*******************");
//	    
//		//String 
//	   
//		FirstJavaClass javaclas=new FirstJavaClass();
//		javaclas.stringname();
//		
//	
		// First 50 numbers odd

		Scanner number = new Scanner(System.in);
		System.out.println("Given number is: ");

		int k = number.nextInt();

		for (k = 0; k <= 50; k++) {

			if (k % 2 == 1) {

				System.out.println("Number is odd");
			}
		}

	}
}
