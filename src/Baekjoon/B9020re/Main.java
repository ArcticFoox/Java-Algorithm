//9020 review_Prime
package Baekjoon.B9020re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        boolean[] isNotPrime = new boolean[10001];
        isNotPrime[0] = isNotPrime[1] = true;
        for (int i = 2; i * i <= 10000; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= 10000; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        for (int t = 0; t < N; t++) {
            int num = Integer.parseInt(br.readLine());
            int a = num / 2;
            int b = num / 2;

            while (isNotPrime[a] || isNotPrime[b]) {
                a--;
                b++;
            }
            sb.append(a).append(" ").append(b).append("\n");
        }

        System.out.print(sb);
    }
}
