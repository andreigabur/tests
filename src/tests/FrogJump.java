package tests;

public class FrogJump {
	
	 public static int solution(int X, int Y, int D) {
		  
		double s = X;
		double f = Y;
		return (int)Math.ceil((f-s)/D);
	
	}
}
