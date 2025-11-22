//1284 basic
package Baekjoon.B1284;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();
            int length = 1;
            if (input.equals("0")) {
                break;
            }

            for(int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch == '0') {
                    length += 5;
                } else if (ch == '1') {
                    length += 3;
                } else {
                    length += 4;
                }
            }
            System.out.println(length);
        }

    }
}
