package in.co.Thread;

import java.util.Arrays;

public class TestArray {
	
	public static void main(String[] args) {
		
		int[] arr = {10,5,1,9,8,11};
		
		Arrays.parallelSort(arr);
	//  Arrays.parallelSort(arr,  3,5):
		
		
		for (int i :arr) {
			System.out.println(i);
			
		}
	}

}
