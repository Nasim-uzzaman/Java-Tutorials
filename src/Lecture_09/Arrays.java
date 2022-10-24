package Lecture_09;

public class Arrays {
	public static void main(String[] args) {
		int number = 10; // premetive type
		int[] numbers = new int[5]; // reference type /hold 5 integer
		int[] num = {15, 20, 25, 30, 35 };
		System.out.println(num[0]);
		/*
		 * numbers[0] = 15; numbers[1] = 20; numbers[2] = 25; numbers[3] = 30;
		 * numbers[4] = 35; /* System.out.println(numbers[0]);
		 * System.out.println(numbers[1]); System.out.println(numbers[2]);
		 * System.out.println(numbers[3]); System.out.println(numbers[4]);
		 */
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			// Iterate through each of the value in array using for loop
		}
	}

}
