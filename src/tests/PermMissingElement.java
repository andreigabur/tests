package tests;

import java.util.Arrays;

public class PermMissingElement {
	
	public static int solution(int[] A) {
		
		int result = A.length + 1;
		
		Arrays.sort(A);
		
		int i = 0;
		while (i<A.length) {
			if (A[i] != i+1){
				return i+1;
			}
			i++;
		}
				
		return result;
		
    }
}
