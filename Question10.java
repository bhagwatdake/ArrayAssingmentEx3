package ArrayAssignmentEx3;

public class Question10 {
	public static void main(String[] args) {
		int arr [] = {3,4,5,3,4,20,10};
		int a = arr.length;
		
	    System.out.println("Original array :" );
	    for(int i = 0; i < a; i ++) {
	    	System.out.print(arr[i] + " ");
	    }
	    //remove dduplicate
	    System.out.println("\n\nafter removing duplicate =");
	    for (int i = 0; i <a ; i ++) {
	    	boolean isDuplicate = false;
	    	
	    	//check if arr[i] is already printed
	    	for(int k = 0; k < i ; k++) {
	    		if(arr[i] == arr[k] ) {
	    			isDuplicate = true;
	    			break;
	    		}
	    	}
	    	//if not duplicate 
	    	if (!isDuplicate) {
	    		System.out.print(arr[i] + " ");
	    	}
	    }
	}

}
//Write a program to remove duplicate elements from an array.
