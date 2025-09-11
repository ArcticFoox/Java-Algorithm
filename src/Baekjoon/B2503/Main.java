//2503 bruteforce
package Baekjoon.B2503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int[] numbers = new int[988];
        int possibleCount = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String guess = st.nextToken();
            int strike = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());

            for (int num = 123; num <= 987; num++) {
                if (isValidNumber(num) && matches(num, guess, strike, ball)) {
                    numbers[num]++;
                }
            }
        }

        for(int num = 123; num <= 987; num++) {
            if(numbers[num] == n){
                possibleCount++;
            }
        }
        System.out.println(possibleCount);
    }

    static boolean isValidNumber(int num) {
        String strNum = String.valueOf(num);
        if (strNum.contains("0")) return false;
        if (strNum.charAt(0) == strNum.charAt(1) || strNum.charAt(1) == strNum.charAt(2) || strNum.charAt(0) == strNum.charAt(2)) {
            return false;
        }
        return true;
    }

    static boolean matches(int num, String guess, int strike, int ball) {
        String strNum = String.valueOf(num);
        int strikeCount = 0;
        int ballCount = 0;

        for (int i = 0; i < 3; i++) {
            if (strNum.charAt(i) == guess.charAt(i)) {
                strikeCount++;
            } else if (strNum.contains(String.valueOf(guess.charAt(i)))) {
                ballCount++;
            }
        }
        return strikeCount == strike && ballCount == ball;
    }
}
