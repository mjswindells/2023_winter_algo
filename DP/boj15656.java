package DP;

import java.io.*;
import java.util.*;

public class boj15656 {

    public static int N, M;
    public static ArrayList<Integer> arr = new ArrayList<Integer>();
    public static ArrayList<Integer> array = new ArrayList<Integer>();
    public static StringBuffer sbAns = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++)
            array.add(Integer.parseInt(st.nextToken()));

        array.sort(null);

        NM(0);
        System.out.println(sbAns);
    }

    public static void NM(int m) {
        if (m == M) {
            StringBuffer sb = new StringBuffer();
            for (int i : arr) {
                sb.append(i + " ");
            }
            sbAns.append(sb + "\n");
        } else {
            for (int i = 0; i < N; i++) {
                arr.add(array.get(i));
                NM(m + 1);
                arr.remove(arr.size() - 1);
            }
        }
    }
}