package DP;

import java.util.*;

public class boj9663 {

    public static int cnt;
    public static int N;
    public static boolean board[][];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new boolean[N+1][N+1];

        Queen(1);

        System.out.println(cnt);

        sc.close();
    }
    public static void Queen(int I){
        if(I == (N+1)){
            cnt++;
            return;
        }

        for(int j=1;j<=N;j++){
            if(Promising(I, j)){
                board[I][j] = true;
                Queen(I+1);
                board[I][j] = false;
            }
        }
    }
    public static boolean Promising(int I, int J){
        // 세로줄
        for(int i = I-1; i>0; i--){
            if(board[i][J])
                return false;
        }
        // y = -x
        for(int i=I-1,j=J-1;(i>0)&&(j>0);i--,j--){
            if(board[i][j])
                return false;
        }
        // y = x
        for(int i=I-1,j=J+1;(i>0)&&(j<=N);i--,j++){
            if(board[i][j])
                return false;
        }
        return true;
    }
}
