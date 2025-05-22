package ArrayAssignmentEx3;

public class Question8 {
  public static void main(String[] args) {
	int arr [] = {10,34,22,12,23};
	int searchElement = 22;
	boolean found = false;
	
	for (int i = 0; i < arr.length; i ++) {
		if ( arr[i] == searchElement) {
			System.out.println(searchElement  + " found ar position " + i);
			found = true;
			break;
		}
	}
	if (!found) {
		System.out.println(searchElement  +  " not found in the array.");
	}
}

}
//8. Write a program to search for an element in an array.
