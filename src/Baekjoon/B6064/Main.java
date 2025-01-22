package Baekjoon.B6064;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int maxj = lcm(M, N);
            int ans = -1;

            for(int j = x; j <= maxj; j+=M){
                int ny = j % N;
                if(ny == 0) ny = N;

                if(ny == y){
                    ans = j;
                    break;
                }
            }

            sb.append(ans).append('\n');
        }

        System.out.println(sb);
    }

    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }
}
