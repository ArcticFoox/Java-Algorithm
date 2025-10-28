//14490 math(GCD)
package Baekjoon.B14490;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(":");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

        int gcd = GCD(A, B);

        System.out.println((A / gcd) + ":" + (B /gcd));
    }

    static int GCD(int A, int B) {
        if(B == 0) return A;
        return GCD(B, A%B);
    }
}
