package in.co.Practice;

public class PMissingNumber {
public static void main(String[] args) {
	int[]a = {1,2,3,5,6,7};
	int[]b = {1,2,3,4,5,6};
	
	int sum = 0;
	int sum1 =0;
	for (int i = 0; i < b.length; i++) {
		sum =sum + a[i];
		
		
	}
	for (int j = 0; j < b.length; j++) {
		sum = sum = b[j];
		
		
	}
	System.out.println("Missing Number="+(sum-sum1));
}
}
