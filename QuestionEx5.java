package ArrayAssignmentEx3;

public class QuestionEx5 {
	public static void main (String [] args) {
		System.out.println("**Program Starts**");
		int arr [] = { 10,7,6,5,9};
		int even = 0;
		int odd = 0;
		
		for ( int i = 0; i < arr.length;  i ++) {
			if (arr [i] % 2 == 0) {
				even ++;    // if divide 2 then even
			} else {
				odd++;  //otherwise its a odd
			}
		}
		System.out.println("Even number = " + even);
		System.out.println("Odd number = " + odd);
		
	}

}
//Write a program to count even and odd numbers in an array.
