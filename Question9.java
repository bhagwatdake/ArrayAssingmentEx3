package ArrayAssignmentEx3;

public class Question9 {
	public static void main(String[] args) {
		int arr1[]  = {10,40,70,80};
		int arr2[] = { 30,20,50,60};
		
		int length1 = arr1.length;
		int length2 = arr2.length;
		
		int [] mergedArray = new int [length1 + length2];
		
		//copy element for arr1 to merged
		for(int i =0; i <length1; i++) {
			mergedArray[i] = arr1[i];
		}
		//copy element for arr2 to mergedArray
		for(int i = 0; i < length2; i++) {
			mergedArray[length1 + i] = arr2[i];
		}
		System.out.println("mergedArray :");
		for(int num : mergedArray) {
			System.out.print(num  + " ");
		}
	}

}
//Write a program to merge two arrays.
