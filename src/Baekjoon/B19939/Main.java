//19939 math
package Baekjoon.B19939;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        N -= K * (K + 1) / 2;

        int cnt = N < 0 ? -1 : N % K == 0 ? K - 1 : K;
        System.out.println(cnt);
    }
}
