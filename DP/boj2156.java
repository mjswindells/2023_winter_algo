package DP;

import java.util.*;

public class boj2156 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] wine = new int[n+1];
		for(int i = 1; i < n+1; i++) {
			wine[i] = scan.nextInt();
		}
		
		int[] dp = new int[n+1];
		dp[1] = wine[1];
		if(n > 1) { 
			dp[2] = wine[1] + wine[2];
		}
	
		for(int i = 3; i < n+1; i++) { 
			dp[i] = Math.max(dp[i-1], Math.max(dp[i-2], dp[i-3] + wine[i-1]) + wine[i]); 
		}
		
		System.out.println(dp[n]);
		
	}

}
