package ArrayAssignmentEx3;

public class Question1 {
	public static void main (String [] args) {
		System.out.println("**Program Starts**");
		int arr [] = { 10,30,40,70};
		int max = arr[0];
		
		for (int i = 1; i <arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Largest element in the array =" + max);
		System.out.println("**Program Ends**");

	}

}



