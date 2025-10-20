//2953 basic
package Baekjoon.B2953;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxScore = 0;
        int winner = 0;

        for(int i = 1; i <= 5; i++) {
            String[] scores = br.readLine().split(" ");
            int totalScore = 0;

            for(String score : scores) {
                totalScore += Integer.parseInt(score);
            }

            if(totalScore > maxScore) {
                maxScore = totalScore;
                winner = i;
            }
        }

        System.out.println(winner + " " + maxScore);
    }
}
