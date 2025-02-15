//10798 string
package Baekjoon.B10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[5];
        int max = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = br.readLine();
            max = Math.max(max, arr[i].length());
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < max; i++){
            for(int j = 0; j < 5; j++) {
                if (arr[j].length() <= i) continue;
                sb.append(arr[j].charAt(i));
            }
        }

        System.out.println(sb);
    }
}
