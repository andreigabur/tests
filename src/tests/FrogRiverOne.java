package tests;

import java.util.Arrays;
import java.util.HashSet;

public class FrogRiverOne {

	public static int solution(int X, int[] A) {
		
		int result = X;
		boolean[] steps = new boolean[result+1];	
		for (int i = 0; i < A.length; i++) {
			if (!steps[A[i]]) {
				steps[A[i]] = true;
				result--;
			}
			if (result == 0) {
				return i;
			}
		}
		
		return -1;
    }
}
