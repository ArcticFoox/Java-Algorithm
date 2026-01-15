//25628 math
package Baekjoon.B25628;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        a /= 2;

        if(a >= b) {
            System.out.println(b);
        }
        else {
            System.out.println(a);
        }
    }
}
