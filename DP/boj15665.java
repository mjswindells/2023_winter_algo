package DP;

import java.util.*;

public class boj15665 {

    public static int N, M, size;
    public static ArrayList<Integer> arr = new ArrayList<>();
    public static LinkedHashSet<Integer> num = new LinkedHashSet<>();
    public static LinkedList<Integer> ans = new LinkedList<>();
    public static StringBuffer sb = new StringBuffer();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        
        for(int i=0;i<N;i++){
            num.add(sc.nextInt());
        }
        for(Integer i : num)
            arr.add(i);

        arr.sort(null);
        size = arr.size();

        ans.add(0);

        NM(0);
        System.out.println(sb.toString());
        sc.close();
    }
    public static void NM(int depth){
        if(depth == M){
            StringBuffer sb2 = new StringBuffer();
            for (int i : ans) {
                if(i == 0){
                    continue;
                }
                sb2.append(i + " ");
            }
            sb.append(sb2.toString() + "\n");
        }else{
            for(int i=0;i<size;i++){
                if(ans.getLast() <= arr.get(i)){
                    ans.add(arr.get(i));
                    NM(depth + 1);
                    ans.remove(ans.size() - 1);
                }
            }
        }
    }
}
