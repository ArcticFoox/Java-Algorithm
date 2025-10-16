//3036 gcd
package Baekjoon.B3036;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int first = Integer.parseInt(st.nextToken());
        for (int i = 1; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            int gcd = gcd(first, num);
            sb.append((first / gcd) + "/" + (num / gcd) + "\n");
        }

        System.out.print(sb);
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
