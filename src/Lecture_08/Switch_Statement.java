/*In this part we'll go through switch statements which is something like
 * if statement. They allow you to take different action depending on the 
 * value of the variable but in some cases they are more efficient than if 
 * statements. */
package Lecture_08;

import java.util.Scanner;

public class Switch_Statement {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		// switch statement only supports few types of variables
		// char, byte, short, int & string
		System.out.println("Enter your instructions: ");
		String text = sc.nextLine();

		switch (text) {
		case "run":
			System.out.println("Proram is running");
			break;
		case "stop":
			System.out.println("program stopped");
			break;
		default:
			System.out.println("Instruction not recognized");
		}

	}

}
