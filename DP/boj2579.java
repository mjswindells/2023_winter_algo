package DP;

import java.util.*;

public class boj2579 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int sum;
		int m=n-1;
		int cnt=0;
		int arr []=new int[n];
		
		for(int i=0; i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		sum=arr[n-1];
		
		while(m>1) {
			cnt=Math.max(arr[m-1],arr[m-2]);
			if(cnt==arr[m-1]) {
				sum=sum+arr[m-1];
				m--;
			}
			else {
				sum=sum+arr[m-2];
			}
			cnt=0;
			m--;
		}

		System.out.println(sum);
	}
	

}
