//9020 GoldbachConjecture
package Baekjoon.B9020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        boolean[] isPrime = new boolean[10001];
        isPrime[0] = isPrime[1] = true;
        for (int i = 2; i * i <= 10000; i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j <= 10000; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            int a = n / 2;
            int b = n / 2;

            while (true) {
                if (!isPrime[a] && !isPrime[b]) {
                    sb.append(a).append(" ").append(b).append("\n");
                    break;
                }
                a--;
                b++;
            }
        }

        System.out.println(sb);
    }
}
