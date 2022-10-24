package Lecture_06;

import java.util.Scanner;

public class Getting_user_input {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter a text line: ");
		String text = sc.nextLine();
		System.out.println("Your line is: "+text);
	}

}
