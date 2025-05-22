package ArrayAssignmentEx3;

import java.util.Arrays;

public class Question7 {
	public static void main(String [] args) {
		int arr[] = { 5,7,3,2,9};
		Arrays.sort(arr);
		
		System.out.println("Sorted array =");
		for (int num : arr) {
			System.out.println(num + " ");
		}
	}

}
//7. Write a program to sort an array in ascending order.
