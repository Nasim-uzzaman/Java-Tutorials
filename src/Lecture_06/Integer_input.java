package Lecture_06;

import java.util.Scanner;

public class Integer_input {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter an integer: ");
			int value = sc.nextInt();
			System.out.println("Your line is: " + value);
		}

	}

}
