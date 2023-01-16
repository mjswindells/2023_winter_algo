package DP;
import java.util.*;

public class boj2839 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int num=scan.nextInt();	
//		int ans=0;
//		
//		while(true) {
//			if(num%5==0) {
//				ans=ans+num/5;
//				System.out.println(ans);
//				break;
//			}
//			else {
//				num=num-3;
//				ans++;
//			}
//			if(num<0) {
//				System.out.println(-1);
//				break;
//			}
//		}
		int [] dp=new int[num+1];
		
		if(num==3) {
            System.out.println(1);
        }
		else if (num==4){
            System.out.println(-1);
        }
		else if(num==5){
            System.out.println(1);
        }
		else {
            dp[0] = -1;
            dp[1] = -1;
            dp[2] = -1;
            dp[3] = 1;
            dp[4] = -1;
            dp[5] = 1;
            for (int i = 6; i < num + 1; i++) {
                if (dp[i - 3] == -1 & dp[i - 5] == -1) {
                    dp[i] = -1;
                }
                else if (dp[i - 5] == -1) {
                    dp[i] = dp[i - 3] + 1;
                }
                else if (dp[i - 3] == -1) {
                    dp[i] = dp[i - 5] + 1;
                }
                else {
                    dp[i] = Math.min(dp[i - 3], dp[i - 5]) + 1;
                }
            }
            System.out.println(dp[num]);
        }
		// for(int j=0;j<num;j++) {
		// 	System.out.print(dp[j]+" ");
		// }
	}

}