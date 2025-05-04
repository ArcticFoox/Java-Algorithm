package Baekjoon.B2846;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        int prev = Integer.parseInt(st.nextToken());
        int start = prev;
        int Max = 0;

        for (int i = 1; i < N; i++) {
            int p = Integer.parseInt(st.nextToken());

            if(p > prev){
                Max = Math.max(Max, p - start);
                prev = p;
            } else {
                start = p;
                prev = p;
            }
        }

        System.out.println(Max);
    }
}
