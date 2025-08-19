//1049 greedy
package Baekjoon.B1049;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int minP = 1000;
        int minC = 1000;

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            if(minP > P) {
                minP = P;
            }
            if(minC > C) {
                minC = C;
            }
        }

        System.out.println( Math.min( minP * (N / 6 + (N % 6 == 0 ? 0 : 1) ), Math.min(minP * (N / 6) + minC * (N % 6), minC * N)));
    }
}
