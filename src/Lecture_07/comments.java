//This is how we can create single line commenting
//The java code will not consider any of these

/*We can create multi-line commenting like this
 *our code will not consider any of these line
 *this is paragraph commenting
 */

package Lecture_07;

import java.util.Scanner;

public class comments {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		double value = sc.nextDouble();
		System.out.println("Your line is: " + value);
	}

}
