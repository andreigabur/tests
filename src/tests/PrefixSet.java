package tests;

import java.util.HashSet;

public class PrefixSet {
	
    public static int solution(int[] A) {
    	
        int n = A.length;
        
        HashSet<Integer> B = new HashSet<Integer>();             
        int result = 0;
        
        for (int i=0; i<n; i++) {
        	if( !B.contains(A[i]) ) {
                B.add(A[i]);
                result = i;
        	}
        }
        
        return result;
    }
}