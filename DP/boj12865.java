package DP;

import java.util.*;

public class boj12865 {

    static int N,K;
    static int Max = -1;
    static int[][] arr = new int[101][2];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();

        arr[0][0] = arr[0][1] = 0;
        for(int i=1;i<=N;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        find(0,0,0);

        System.out.println(Max);

        sc.close();
    }

    public static void find(int idx, int sum, int max){
        sum += arr[idx][0];
        max += arr[idx][1];
        if(sum > K) return;

        Max = Math.max(Max , max);

        for(int i=idx+1;i<=N;i++){
            find(i,sum,max);
        }
    }
}