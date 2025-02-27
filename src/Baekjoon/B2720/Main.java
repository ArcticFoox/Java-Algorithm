//2720 greedy
package Baekjoon.B2720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine());

            int[] coin = new int[4];

            if(N / 25 > 0){
                coin[0] += N / 25;
                N %= 25;
            }

            if(N / 10 > 0){
                coin[1] += N / 10;
                N %= 10;
            }

            if(N / 5 > 0){
                coin[2] += N / 5;
                N %= 5;
            }

            coin[3] += N;

            StringBuilder sb = new StringBuilder();
            for(int i : coin) {
                sb.append(i).append(" ");
            }

            System.out.println(sb);
        }
    }
}
