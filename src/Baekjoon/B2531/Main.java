//2531 sliding_window
package Baekjoon.B2531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] sushi = new int[N];
        int[] count = new int[d + 1];
        for (int i = 0; i < N; i++) {
            sushi[i] = Integer.parseInt(br.readLine());
        }

        count[c] = 1;
        int ate = 1;
        int maxAte = 0;

        for(int i = 0; i < k; i++) {
            if(count[sushi[i]] == 0) {
                ate++;
            }
            count[sushi[i]]++;
        }

        maxAte = ate;

        for(int i = 1; i < N; i++){

            count[sushi[i - 1]]--;
            if(count[sushi[i - 1]] == 0) ate--;

            count[sushi[(i + k - 1) % N]]++;
            if(count[sushi[(i + k - 1) % N]] == 1) ate++;

            maxAte = Math.max(maxAte, ate);
        }

        System.out.println(maxAte);
    }
}
