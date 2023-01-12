package DP;
import java.util.*;

public class boj11051 {
	
	static int dp[][] = new int[1001][1001];
	
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		System.out.println(com(n,k));
	}

	public static int com(int n,int k){
		if(dp[n][k]>0) return dp[n][k];
		if(k==0||k==n) 
			return dp[n][k] = 1;
		return dp[n][k] = (com(n-1,k-1)%10007+com(n-1,k)%10007)%10007;
	}
}