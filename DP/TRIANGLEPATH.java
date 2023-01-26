package DP;
import java.util.*;

public class TRIANGLEPATH {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		int max=0;
		int [][] arr=new int[n][n];
		int [][] sum=new int[n][n];
//		int [][] dp=new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		sum[0][0]=arr[0][0];
		sum[1][0]=sum[0][0]+arr[1][0];
		sum[1][1]=sum[0][0]+arr[1][1];
		for(int k=2;k<n;k++) {
			for(int l=0;l<k+1;l++) {
				if(l==0) {
					sum[k][l]=sum[k-1][l]+arr[k][l];
				}
				else {
					sum[k][l]=Math.max(sum[k-1][l-1]+arr[k][l],sum[k-1][l]+arr[k][l]);
				}
			}
		}
		for(int a=0;a<n;a++) {
			max=Math.max(max,sum[n-1][a]);
		}
		System.out.println(max);
		
		
        
	}

}
