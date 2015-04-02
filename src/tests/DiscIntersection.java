package tests;

public class DiscIntersection {
    public static int solution(int[] A) {
    	
    	int result = 0;
    	int n = Math.min(A.length, Integer.MAX_VALUE);
        int[] dps = new int[A.length];
        int[] dpe = new int[A.length];

        for (int i = 0; i < n; i++)
        {
            dps[Math.max(0, i - A[i])]++;
            dpe[Math.min(n - 1, i + A[i])]++;
        }

        int t = 0;
        for (int i = 0; i < n; i++)
        {
            if (dps[i] > 0)
            {
                result += t * dps[i];
                result += dps[i] * (dps[i] - 1) / 2;
                t += dps[i];
            }
            t -= dpe[i];
            
            if (result > 10000000) {
            	return -1;
            }
        }

        return result;      
    }
}