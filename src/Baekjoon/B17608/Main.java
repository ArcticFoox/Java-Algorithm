//17608 basic
package Baekjoon.B17608;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int min = arr[N-1];
        int cnt = 1;

        for(int i = N-2; i >= 0; i--) {
            if(arr[i] > min) {
                min = arr[i];
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
