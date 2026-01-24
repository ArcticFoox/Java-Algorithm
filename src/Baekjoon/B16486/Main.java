//16486 basic
package Baekjoon.B16486;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        double pi = 3.141592;
        System.out.println(2 * a + 2 * pi * b);
    }
}
