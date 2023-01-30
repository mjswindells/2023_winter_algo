package DP;

import java.util.*;

public class boj1904 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [] dp=new int[n+3];
		
		dp[0]=0;
		dp[1]=1; //1
		dp[2]=2; //00,11
//		dp[3]=3; //100,111,001
//		dp[4]=5; //0000, 0011, 1001, 1100, 1111
		
		for(int i=3;i<=n;i++) {
			dp[i]=(dp[i-1]+dp[i-2])%15746;
		}
		
		System.out.println(dp[n]);
	}

}
