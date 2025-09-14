//2810 greedy
package Baekjoon.B2810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String seats = br.readLine();
        int count = 1;

        for (int i = 0; i < n; i++) {
            if (seats.charAt(i) == 'S') {
                count++;
            } else if (seats.charAt(i) == 'L') {
                count += 1;
                i++;
            }
        }

        if(count > n)
            count = n;

        System.out.println(count);

    }
}
