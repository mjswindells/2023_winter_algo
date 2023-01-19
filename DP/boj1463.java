package DP;

import java.util.*;

public class boj1463 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int in=scan.nextInt();
		
		int [] dp=new int[in+1];
		
		dp[1]=0;
		dp[2]=1;
		dp[3]=1;
		for(int i=4; i<=in; i++) {
            dp[i] = dp[i-1] + 1; 

            if(i%3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1); 
            }
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1); 
            }
        }
		System.out.println(dp[in]);
		
		
	}

}