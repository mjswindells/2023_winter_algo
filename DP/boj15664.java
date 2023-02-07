package DP;

import java.io.*;
import java.util.*;

public class boj15664 {

    public static int N, M;
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
        arr.add(0);

        NM(0,0);
        for (String s : set)
            System.out.println(s);
    }

    public static void NM(int m,int idx) {
        if (m == M) {
            StringBuffer sb = new StringBuffer();
            for (int i : arr) {
                if(i == 0){
                    continue;
                }
                sb.append(i + " ");
            }
            set.add(sb.toString());
        } else {
            for (int i = idx; i < N; i++) {
                if (arr.getLast() <= array.get(i)) {
                    arr.add(array.get(i));
                    NM(m + 1, idx + 1);
                    arr.remove(arr.size() - 1);
                }
            }
        }
    }
}