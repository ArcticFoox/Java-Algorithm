//17614 bruteforce
package Baekjoon.B17614;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        for(int i = 1; i <= n; i++) {
            int num = i;
            while(num > 0) {
                if(num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
                    cnt++;
                }
                num /= 10;
            }
        }

        System.out.println(cnt);
    }
}
