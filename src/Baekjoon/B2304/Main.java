//2304 stack?
package Baekjoon.B2304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[1001];
        int b = 1000;
        int en = 0;
        int max_height = 0;
        int max_idx = 0;
        int sum = 0;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            b = Math.min(b, idx);
            en = Math.max(en, idx);
            arr[idx] = Integer.parseInt(st.nextToken());
            if(arr[idx] > max_height) {
                max_height = arr[idx];
                max_idx = idx;
            }
        }

        int height = 0;
        for(int i = b; i <= max_idx; i++) {
            if(arr[i] > height) {
                height = arr[i];
            }
            sum += height;
        }

        height = 0;
        for(int i = en; i > max_idx; i--) {
            if(arr[i] > height) {
                height = arr[i];
            }
            sum += height;
        }

        System.out.println(sum);
    }
}
