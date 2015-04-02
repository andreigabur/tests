package tests;

public class TapeEquilibrium {
	
	public static int solution(int[] A) {
	  
		long totalSum = 0;
		long firstSum = 0;
		
		for (int i = 0; i < A.length; i++) {
			totalSum += A[i];
		}
		
		long result = Math.abs(totalSum-2*A[0]);
				
		for (int i = 0; i < A.length-1; i++) {
			firstSum += A[i];
			totalSum -= A[i];
			if (Math.abs(totalSum - firstSum) < result) {
				result = Math.abs(totalSum - firstSum);
			}
		}
		
		return (int)result;
	
	}
}
