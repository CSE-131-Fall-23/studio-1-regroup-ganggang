package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard= new Scanner(System.in);
		System.out.println("the first of two integers to be averaged?");
		int n1 = keyboard.nextInt();
		System.out.println("the second of two integers to be averaged?");
		int n2 = keyboard.nextInt();
		double average = (n1+n2)/2.0;
		System.out.println("average of n1 and n2 is " + average);
				

	}

}
