package DP;

import java.io.*;
import java.util.*;

public class boj15650 {

    public static int N, M;
    public static boolean[] isUsed = new boolean[100];
    public static ArrayList<Integer> arr = new ArrayList<Integer>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        NM(0, 1);
    }

    public static void NM(int m,int idx) {
        if (m == M) {
            for(int i : arr){
                System.out.print(i + " ");
            }
            System.out.print("\n");
        } else {
            for (int i = idx; i <= N; i++) {
                if (!isUsed[i]) {
                    isUsed[i] = true;
                    arr.add(i);
                    NM(m+1,i+1);
                    arr.remove(arr.size()-1);
                    isUsed[i] = false;

                }
            }
        }

    }
}
