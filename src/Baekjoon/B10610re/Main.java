//10610 greedy
package Baekjoon.B10610re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        char[] digits = input.toCharArray();
        Arrays.sort(digits);
        int sum = 0;
        String answer = "";

        for(int i = digits.length - 1; i >= 0; i--) {
            sum += digits[i] - '0';
            answer += digits[i];
        }

        if(digits[0] != '0' || sum % 3 != 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(answer);
    }
}
