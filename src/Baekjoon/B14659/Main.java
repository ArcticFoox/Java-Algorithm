//14659 greedy
package Baekjoon.B14659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int maxCount = 0;
        int currentCount = 0;
        int maxHeight = 0;

        for (int i = 0; i < n; i++) {
            int height = Integer.parseInt(st.nextToken());
            if (height > maxHeight) {
                maxHeight = height;
                currentCount = 0;
            } else {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            }
        }

        System.out.println(maxCount);
    }
}
