package Fibonancci;

import java.util.Scanner;

public class Fibonacci_series {
	public static void main(String[] args) {
		int num, a = 0, b = 0, c =1;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the number of times to display the series");
		num = kb.nextInt();
		System.out.println("The Fibonacci series is: ");
		for (int i =0; i<num; i++) {
			a = b;
			b = c;
			c = a+b;
			System.out.println(a + ""); // use print() to make on same line instead
		}
	}

}
