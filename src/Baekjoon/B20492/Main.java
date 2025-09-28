//20492 basic
package Baekjoon.B20492;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println((int)(n - (n * 0.22)));
        System.out.println((int)(n - ((n * 0.2) * 0.22)));
    }
}
