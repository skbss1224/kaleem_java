package kaleem;

import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		//arithmetic operator
		//+ -plus operator
		//- -minus operator
		//* -mul operator
		// /  -div operator
		// %  - per operator
		
		  int sasi=80; int kaleem=67;
		  int c;
		  c=sasi+kaleem;
		  System.out.println("plus operator="+""+c);
		  c=sasi-kaleem;
		  System.out.println("minus operator="+""+c);
		  c=sasi*kaleem;
		  System.out.println("mul operator="+""+c);
		  c=sasi/kaleem;
		  System.out.println("div operator="+""+c);
		  c=sasi%kaleem;
		  System.out.println("per operator="+""+c);
		 
		
		  Scanner scan=new Scanner(System.in);
		  System.out.println("enter the sasi value:");
		  int sasi=scan.nextInt();
		  System.out.println("enter the kaleem value:");
		  int kaleem=scan.nextInt(); 
		  int c;
		  c=sasi+kaleem; 
		  System.out.println("plus operator"+c);
		  c=sasi-kaleem;
		  System.out.println("minus operator"+c);
		  c=sasi*kaleem;
		  System.out.println("mul operator"+c);
		  c=sasi/kaleem;
		  System.out.println("div operator"+c);
		  c=sasi%kaleem;
		  System.out.println("per operator"+c);
		 
		/*
		 * relation operator <-lessthan >-greather than <=-lessthan equal >=-greaterthan
		 * equal ==-assignment operator
		 */
		int tamil=90,english=66,maths=90,science=56,social=59;
		boolean c;
		c=tamil==maths;
		System.out.println("assignment operator"+ c);
		c=tamil<maths;
		System.out.println("lessthan operator"+c);
		c=tamil>maths;
		System.out.println("greatherthan operator"+c);
		c=tamil<=maths;
		System.out.println("lessthan eqaul"+c);
		c=tamil>=maths;
		System.out.println("greaterthan equal"+c);
		
	}

}
