package Lecture_10;

public class Multidimentional_Array {
	public static void main(String[] args) {
		int[] oneDimentionalArray = { 12, 49, 922 };
		System.out.println(oneDimentionalArray[1]);

		int[][] multiDimentionalArray = { { 12, 49, 922 }, { 23, 56, 78, 12 }, { 12, 34, 56 } };
		System.out.println(multiDimentionalArray[1][3]);
		System.out.println(multiDimentionalArray[2][1]);
		
		double[][] doublearray = new double[4][2];
		doublearray[3][1] = 2.6;
		
		System.out.println(doublearray[3][1]);
		
		for(int array = 0; array<multiDimentionalArray.length; array++) {
			for(int item = 0; item<multiDimentionalArray[array].length; item++) {
				System.out.print(multiDimentionalArray[array][item]+"\t");
			}
			System.out.println();
		}

	}

}
