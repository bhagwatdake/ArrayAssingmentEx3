package ArrayAssignmentEx3;

public class Question6 {
	public static void main(String [] args) {
		System.out.println("**Program Starts**");
		int arr1 [] = { 10,20,30,40,50};
		int copy [] = new int [arr1.length];   
		
		//copy each element from arr1 to copy
		for (int i = 0; i < arr1.length; i++) {
			copy[i] = arr1[i];
		}
		//print the copied array
		System.out.println("Copied array :");
		for(int i = 0; i < copy.length; i ++) {
			System.out.println(copy[i] + " ");
		}
 		System.out.println("**program Ends**");
	}

}
//6. Write a program to copy one array to another.
