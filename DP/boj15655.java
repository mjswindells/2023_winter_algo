package DP;

import java.io.*;
import java.util.*;

public class boj15655 {

    public static int N, M;
    public static boolean[] isUsed = new boolean[100];
    public static ArrayList<Integer> arr = new ArrayList<Integer>();
    public static ArrayList<Integer> array = new ArrayList<Integer>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0;i<N;i++)
            array.add(Integer.parseInt(st.nextToken()));

        array.sort(null);

        NM(0,0);
    }

    public static void NM(int m,int idx) {
        if (m == M) {
            for(int i : arr){
                System.out.print(i + " ");
            }
            System.out.print("\n");
        } else {
            for (int i = idx; i < N; i++) {
                if (!isUsed[i]) {
                    isUsed[i] = true;
                    arr.add(array.get(i));
                    NM(m+1,i+1);
                    arr.remove(arr.size()-1);
                    isUsed[i] = false;

                }
            }
        }

    }
}