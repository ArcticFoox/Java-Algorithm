//5554 basic
package Baekjoon.B5554;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalSeconds = 0;

        for (int i = 0; i < 4; i++) {
            int seconds = Integer.parseInt(br.readLine());
            totalSeconds += seconds;
        }

        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        System.out.println(minutes);
        System.out.println(seconds);
    }
}
