//9063 basic
package Baekjoon.B9063;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[] x = new int[N];
        int[] y = new int[N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        int minX = x[0];
        int maxX = x[0];
        int minY = y[0];
        int maxY = y[0];

        for(int i = 0; i < N; i++) {
            if(x[i] < minX) {
                minX = x[i];
            }
            if(x[i] > maxX) {
                maxX = x[i];
            }
            if(y[i] < minY) {
                minY = y[i];
            }
            if(y[i] > maxY) {
                maxY = y[i];
            }
        }

        if(N == 1) {
            System.out.println(0);
        } else {
            int width = maxX - minX;
            int height = maxY - minY;
            System.out.println(width * height);
        }
    }
}
