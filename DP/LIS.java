package DP;

import java.util.*;

public class LIS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // int C = sc.nextInt();

        // while(C-->0){
            int N = sc.nextInt();
        
            int[] arr = new int[N + 1];
            int[] dp = new int[N + 1];
            int max = 1;

            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
                dp[i] = 1;
                for(int j=0;j<i;j++){
                    if(arr[j]<arr[i])
                        dp[i] = Math.max(dp[i],dp[j] + 1);
                }
                max = Math.max(max,dp[i]);
            }
            System.out.println(max);

            int value = max;
            Stack<Integer> stack = new Stack<>();

            for (int i = N; i >= 0; i--) {
                if (value == dp[i]) {
                    stack.push(arr[i]);
                    value--;
                }
            }

            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
        // }
        sc.close();
    }    
}
