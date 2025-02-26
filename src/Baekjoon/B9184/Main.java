//9184 dp
package Baekjoon.B9184;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dp = new int[101][101][101];

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == -1 && b == -1 && c == -1) break;

            System.out.println("w(" + a + ", " + b + ", " + c + ") = " + w(a,b,c));
        }
    }

    static int w(int a, int b, int c) {
        if(a <= 0 || b <= 0 || c <= 0) return 1;

        if(a > 20 || b > 20 || c > 20) return w(20, 20, 20);

        if(dp[a+50][b+50][c+50] != 0) return dp[a+50][b+50][c+50];

        if(a < b && b < c) return dp[a+50][b+50][c+50] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);

        return dp[a+50][b+50][c+50] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
    }
}
