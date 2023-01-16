package DP;

import java.util.*;
import java.io.*;

public class boj2096 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int arr[][] = new int[N + 1][3];
        int max[][] = new int[N + 1][3];
        int min[][] = new int[N + 1][3];

        int Max, Min;
        Max = Min = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 3; j++) {
                int t = Integer.parseInt(st.nextToken());
                arr[i][j] = t;
            }
        }

        if (N == 1) {
            Max = ((arr[0][0] > arr[0][1]) ? arr[0][0] : arr[0][1]) > arr[0][2]
                    ? ((arr[0][0] > arr[0][1]) ? arr[0][0] : arr[0][1])
                    : arr[0][2];
            Min = ((arr[0][0] > arr[0][1]) ? arr[0][1] : arr[0][0]) > arr[0][2] ? arr[0][2]
                    : ((arr[0][0] > arr[0][1]) ? arr[0][1] : arr[0][0]);
            System.out.println(Integer.toString(Max) + " " + Integer.toString(Min));
        } else {
            for (int i = 0; i < 3; i++) {
                max[N - 1][i] = min[N - 1][i] = arr[N - 1][i];
            }
            for (int i = N - 2; i >= 0; i--) {
                for (int j = 0; j < 3; j++) {
                    if (j == 0) {
                        max[i][j] += (arr[i][j]
                                + (max[i + 1][j] > max[i + 1][j + 1] ? max[i + 1][j] : max[i + 1][j + 1]));
                        min[i][j] += (arr[i][j]
                                + (min[i + 1][j] > min[i + 1][j + 1] ? min[i + 1][j + 1] : min[i + 1][j]));
                    } else if (j == 2) {
                        max[i][j] += (arr[i][j]
                                + (max[i + 1][j] > max[i + 1][j - 1] ? max[i + 1][j] : max[i + 1][j - 1]));
                        min[i][j] += (arr[i][j]
                                + (min[i + 1][j] > min[i + 1][j - 1] ? min[i + 1][j - 1] : min[i + 1][j]));
                    } else {
                        Max = ((max[i + 1][j - 1] > max[i + 1][j]) ? max[i + 1][j - 1] : max[i + 1][j]) > max[i + 1][j
                                + 1]
                                        ? ((max[i + 1][j - 1] > max[i + 1][j]) ? max[i + 1][j - 1] : max[i + 1][j])
                                        : max[i + 1][j + 1];
                        Min = ((min[i + 1][j - 1] > min[i + 1][j]) ? min[i + 1][j] : min[i + 1][j - 1]) > min[i + 1][j
                                + 1] ? min[i + 1][j + 1]
                                        : ((min[i + 1][j - 1] > min[i + 1][j]) ? min[i + 1][j] : min[i + 1][j - 1]);

                        max[i][j] += (arr[i][j] + Max);
                        min[i][j] += (arr[i][j] + Min);
                    }
                }
            }
            Max = ((max[0][0] > max[0][1]) ? max[0][0] : max[0][1]) > max[0][2]
                    ? ((max[0][0] > max[0][1]) ? max[0][0] : max[0][1])
                    : max[0][2];
            Min = ((min[0][0] > min[0][1]) ? min[0][1] : min[0][0]) > min[0][2] ? min[0][2]
                    : ((min[0][0] > min[0][1]) ? min[0][1] : min[0][0]);
            System.out.println(Integer.toString(Max) + " " + Integer.toString(Min));
        }
    }
}