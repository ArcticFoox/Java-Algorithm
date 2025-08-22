//14626 bruteforce
package Baekjoon.B14626;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int idx = 0;
        int sum = 0;

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '*') {
                idx = i;
                continue;
            }

            if(i % 2 == 0) {
                sum += input.charAt(i) - '0';
            } else {
                sum += (input.charAt(i) - '0') * 3;
            }
        }

        for(int i = 0; i < 10; i++) {
            if(idx % 2 == 0) {
                if ((sum + i) % 10 == 0) {
                    System.out.println(i);
                    return;
                }
            } else {
                if ((sum + i * 3) % 10 == 0) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}
