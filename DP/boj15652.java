package DP;

import java.io.*;
import java.util.*;

public class boj15652 {

    public static int N, M;
    public static LinkedList<Integer> arr = new LinkedList<Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr.add(0);
        NM(0);
    }

    public static void NM(int m) {
        if (m == M) {
            for (int i : arr) {
                if(i==0)
                    continue;
                System.out.print(i + " ");
            }
            System.out.print("\n");
        } else {
            for (int i = 1; i <= N; i++) {
                if (arr.getLast() <= i) {
                    arr.add(i);
                    NM(m + 1);
                    arr.removeLast();
                }
            }
        }
    }

}