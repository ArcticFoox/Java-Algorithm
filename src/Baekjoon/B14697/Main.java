//14697 bruteforce
package Baekjoon.B14697;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[3];
        for (int i = 0; i < 2; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        N = Integer.parseInt(st.nextToken());

        boolean result = solve(0, N);

        if (result){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    static boolean solve(int idx, int n) {

        if (idx == 3 && n > 0){
            return false;
        }

        if (n == 0){
            return true;
        }

        for (int i = n / arr[idx]; i >= 0; i--) {
            if (solve(idx + 1, n - i * arr[idx])){
                return true;
            }
        }
        return false;
    }


    static void solve2() {

        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        int n = N;

        for (int i = 0; i <= n / a; i++) {
            for (int j = 0; j <= n / b; j++) {
                for (int k = 0; k <= n / c; k++) {
                    if (a * i + b * j + c * k == n) {
                        System.out.println(1);
                        return;
                    }
                }
            }
        }

        System.out.println(0);
    }

}
