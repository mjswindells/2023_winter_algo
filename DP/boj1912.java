package DP;

import java.util.*;

public class boj1912 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		int [] arr=new int [n+1];
		
		for(int i=1;i<n+1;i++) {
			arr[i]=scan.nextInt();
		}
		
		int [] dp=new int[n+1];
		
		dp[1]=arr[1];
		for(int i=2;i<n+1;i++) {
			dp[i]=Math.max(dp[i-1]+arr[i],arr[i]);
		}
//		for(int i=2;i<n+1;i++) {
//			if(arr[i-1]+arr[i]>arr[i-1]) {
//				dp[i]=arr[i-1]+arr[i];
//			}
//			else {
//				dp[i]=-10000;
//				i++;
//			}
//		}
//처음 생각했던 잘못된 코드
		
		int max=dp[1];
		for(int i=2;i<n+1;i++) {
			if(dp[i]>max) {
				max=dp[i];
			}
			else {
				max=max;
			}
		}
		System.out.println(max);
		//-가 됐어도 전체 합은 커질 수 있는 경우를 생각해보자

	}

}
