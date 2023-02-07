package DP;

import java.io.*;
import java.util.*;

public class boj15663 {

    public static int N, M;
    public static boolean[] isUsed = new boolean[8];
    public static LinkedList<Integer> arr = new LinkedList<Integer>();
    public static ArrayList<Integer> array = new ArrayList<Integer>();
    public static LinkedHashSet<String> set = new LinkedHashSet<>();

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
        for(String s : set)
            System.out.println(s);
    }

    public static void NM(int m) {
        if (m == M) {
            StringBuffer sb = new StringBuffer();
            for (int i : arr) {
                sb.append(i + " ");
            }
            set.add(sb.toString());
        } else {
            for (int i = 0; i < N; i++) {
                if(!isUsed[i]){
                    isUsed[i] = true;
                    arr.add(array.get(i));
                    NM(m + 1);
                    isUsed[i] = false;
                    arr.remove(arr.size() - 1);
                }
            }
        }
    }
}