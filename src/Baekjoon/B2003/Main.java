//2003 bruteforce(two_pointer)
package Baekjoon.B2003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        int start = 0;
        int end = 0;
        int sum = arr[start];

        while(true){
            if(end >= N) break;

            if(sum > M){
                sum -= arr[start++];
            } else if(sum == M){
                cnt++;
                sum += arr[++end];
            } else {
                sum += arr[++end];
            }
        }

        System.out.println(cnt);
    }
}
