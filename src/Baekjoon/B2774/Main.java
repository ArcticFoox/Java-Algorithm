//2774 basic
package Baekjoon.B2774;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            int[] number = new int[10];
            for (int j = 0; j < input.length(); j++) {
                number[input.charAt(j) - '0']++;
            }

            int size = 0;
            for(int j = 0; j < 10; j++){
                if(number[j] != 0) size++;
            }

            sb.append(size).append("\n");
        }

        System.out.println(sb);
    }
}
