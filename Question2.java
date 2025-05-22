package ArrayAssignmentEx3;

public class Question2 {
	public static void main(String[] args) {
		int arr[] = { 50,70,30,60,33};
		int sum = 0;
		
		for (int i = 0;  i < arr.length;  i ++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum =" + sum);
	}

}
