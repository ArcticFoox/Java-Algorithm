//9237 greedy(sort)
package Baekjoon.B9237;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        int[] growthDays = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            growthDays[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(growthDays);
        int maxDays = 0;
        for (int i = 0; i < n; i++) {
            int daysToGrow = growthDays[i] + (n - i);
            maxDays = Math.max(maxDays, daysToGrow);
        }

        System.out.println(maxDays + 1);
    }
}
