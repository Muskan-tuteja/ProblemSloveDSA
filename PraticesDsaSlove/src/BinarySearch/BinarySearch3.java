package BinarySearch;

public class BinarySearch3 {
	public static void main(String[] args) {
		int arr [] = {10,20,30,50,60,89};
		int target = 60;
		
		int low = 0;
		
		int high = arr.length-1;
		
		while(low<= high) {
			int mid = (low+high)/2;
			if(arr[mid] == target) {
				System.out.println("Found at index : " + mid);
				break;
				
			}else if(arr[mid] < target) {
				low = mid +1;
				
			}else {
				high = mid -1;
			}
			
		}
				
		
	}

}
