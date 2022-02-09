package com.simplilearn.calculator;
import java.util.Scanner;
public class calculatorswitch {
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter 1st number");
			double n1=sc.nextDouble();
			System.out.println("enter 2nd number");
			double n2=sc.nextDouble();
			System.out.println("operator");
			char op=sc.next().charAt(0);
			double n;
			switch(op) {
			case '+':
				n=n1+n2;
				System.out.println(n);
				break;
			case '-':
				n=n1-n2;
				System.out.println(n);
				break;
			case '*':
				n=n1*n2;
				System.out.println(n);
				break;
			case '%':
				n=n1%n2;
				System.out.println(n);
				break;
			default:
				System.out.println("Invalid input");
		}
			

	}
}
