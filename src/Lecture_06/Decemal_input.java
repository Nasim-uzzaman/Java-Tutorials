package Lecture_06;

import java.util.Scanner;

public class Decemal_input {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		double value = sc.nextDouble();
		System.out.println("Your line is: " + value);
	}

}
