/*This code will show how to take an input from user 
 * and it will take input continuously
 * until the it gets the desired value
 * when it gets the desired value then
 * it will print the value */
package Lecture_07;

import java.util.Scanner;

public class Do_While_Loop {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int number = 0;
		do {
			System.out.println("Enter a number: ");
			number = sc.nextInt();
		} while (number != 9);
		System.out.println("You got 9!");

	}
}
