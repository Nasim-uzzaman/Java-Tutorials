package Lecture_03;

public class string1 {
	public static void main(String[] args) {
		int aNumber = 9;
		double aDouble = 9.5;
		String text = "Hi";
		String blank = " ";
		String moreText = "there";
		String hiThere = text+blank+moreText;
		System.out.println(text);
		System.out.println(text + blank + moreText); //concatenate
		System.out.println("hi"+" "+"There"); //adding string variables
		System.out.println(hiThere);//another way to print together
		System.out.println("My numbers are: " + aNumber +" , "+ aDouble);//concatenate different types of number
		
	
		/*String text = "abcde";

		for (int i = 0; i<3; i+=2)

		System.out.print(text[i]);*/

}
}
