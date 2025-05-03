package Baekjoon.B1673;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        while ((str = br.readLine()) != null && !str.isEmpty()) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int sum = N;
            int stamps;

            while (N >= K) {
                stamps = N / K;
                sum += stamps;
                N = stamps + (N % K);
            }

            System.out.println(sum);
        }
    }
}
