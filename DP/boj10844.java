package DP;

import java.util.*;

public class boj10844 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        long mod = 1000000000;

        long[][] dp = new long[101][10];

        for(int i=1;i<10;i++)
            dp[1][i]=1;
        
        for(int i=2;i<=N;i++){
            for(int j=0;j<10;j++){
                if(j==0)
                    dp[i][j] = dp[i-1][j+1] % mod;
                else if(j==9)
                    dp[i][j] = dp[i-1][j-1] % mod;
                else
                    dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % mod;
            }
        }
        //// 자바에서는 초기값이 자동으로 0인걸 이용한 풀이 
        // for (int i = 2; i <= N; i++) {
		// 	dp[i][0] = dp[i - 1][1];
		// 	for (int j = 1; j <= 9; j++) {
		// 		dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % mod;
		// 	}
		// }

        // 리턴값 타입을 long으로 안하면 틀리니 주의
        long ret = 0;
        for(int i=0;i<10;i++){
            ret+=dp[N][i];
        }
        System.out.println(ret % mod);
    }    
}
