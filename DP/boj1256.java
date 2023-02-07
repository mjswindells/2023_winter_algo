package DP;

import java.util.*;

public class boj1256 {

	static long dp[][] = new long[201][201];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextInt();

        if(com(n+m,m)<k){
            System.out.println(-1);
            sc.close();
            return;
        }
        while(n!=0 && m!=0){
            if(dp[n+m-1][m]>=k){
                n--;
                System.out.print('a');
            }else{
                k-=dp[n+m-1][m];
                m--;
                System.out.print('z');
            }
        }
        while(n-->0)
            System.out.print('a');
        while(m-->0)
            System.out.print('z');

        sc.close();
    } 

	public static long com(int n,int k){
        // 잘료형으로 인해 초과한 범위에 대해서는 예외처리를 해주었다
        if(dp[n][k]>=1000000001 || dp[n][k]<-1){
            return dp[n][k]=1000000001;
            
        }
		if(dp[n][k]>0) return dp[n][k];
		if(k==0||k==n) 
			return dp[n][k] = 1;
		return dp[n][k] = com(n-1,k-1)+com(n-1,k);
	}
}
