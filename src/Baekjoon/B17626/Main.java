package Baekjoon.B17626;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];

        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            int Min = 987654321;
            for(int j = 1; j * j <= i; j++){
                int tmp = i - j * j;
                Min = Math.min(Min, dp[tmp]);
            }
            dp[i] = Min + 1;
        }

        System.out.println(dp[n]);
    }
}
