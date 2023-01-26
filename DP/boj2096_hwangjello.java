package DP;

import java.util.Scanner;

public class boj2096_hwangjello {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		int max=0;
		int min=1000000;
		int [][] arr=new int[n][3];
		int [][] max_sum=new int[n][3];
		int [][] min_sum=new int[n][3];

		for(int i=0;i<n;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		for(int a=0;a<3;a++) {
			max_sum[0][a]=arr[0][a];
			min_sum[0][a]=arr[0][a];
		}
		
		for(int k=1;k<n;k++) {
			for(int l=0;l<3;l++) {
				if(l==0) {
					max_sum[k][0]=Math.max(max_sum[k-1][0],max_sum[k-1][1])+arr[k][0];
					min_sum[k][0]=Math.min(min_sum[k-1][0],min_sum[k-1][1])+arr[k][0];
				}
				else if(l==1) {
					max_sum[k][1]=Math.max(Math.max(max_sum[k-1][0],max_sum[k-1][1]),max_sum[k-1][2])+arr[k][1];
					min_sum[k][1]=Math.min(Math.min(min_sum[k-1][0],min_sum[k-1][1]),min_sum[k-1][2])+arr[k][1];	
				}
				else if(l==2) {
					max_sum[k][2]=Math.max(max_sum[k-1][1],max_sum[k-1][2])+arr[k][2];
					min_sum[k][2]=Math.min(min_sum[k-1][1],min_sum[k-1][2])+arr[k][2];
				}
			}
		}

		for(int b=0;b<3;b++) {
			max=Math.max(max,max_sum[n-1][b]);
		}
		for(int c=0;c<3;c++) {
			min=Math.min(min,min_sum[n-1][c]);
		}
		System.out.println(max+" "+min);
	}

}
