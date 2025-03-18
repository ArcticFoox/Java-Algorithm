//1735 euclidean_algorithm
package Baekjoon.B1735;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int numerator = a * d + b * c;
        int denominator = b * d;

        int mod = gcd(numerator, denominator);
        numerator /= mod;
        denominator /= mod;

        System.out.println(numerator + " " + denominator);
    }

    static int gcd(int a, int b) {
        if(a <= b){
            int tmp = a;
            a = b;
            b = tmp;
        }

        if(b == 0) return a;

        return gcd(b, a % b);
    }
}
