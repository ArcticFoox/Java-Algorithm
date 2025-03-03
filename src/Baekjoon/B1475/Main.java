//1475 array
package Baekjoon.B1475;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] arr = new int[10];

        for(char i : str.toCharArray()) {
            if(i == '6') arr[9]++;
            else arr[i - '0']++;
        }

        int max = 0;
        for(int i = 0; i < 9; i++) {
            max = Math.max(max, arr[i]);
        }

        int nine = arr[9] / 2;
        if(arr[9] % 2 == 1) nine++;
        max = Math.max(max, nine);

        System.out.println(max);
    }
}
