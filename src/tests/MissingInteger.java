package tests;

import java.util.Arrays;

public class MissingInteger {

	public static int solution(int[] A) {
			
		int result = 1;
		
		Arrays.sort(A);
		
		for (int i = 0; i<A.length; i++) {
			if (A[i] == result) {
				result++;
			}
		}
		
		
		return result;
		
    }
	
}
