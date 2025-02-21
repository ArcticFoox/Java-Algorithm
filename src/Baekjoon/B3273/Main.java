//3273 sort(two_point)
package Baekjoon.B3273;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int x = Integer.parseInt(br.readLine());

        int cnt = 0;
        int s = 0;
        int en = N - 1;
        while(s < en){
            if(arr[s] + arr[en] > x){
                en--;
            } else if(arr[s] + arr[en] == x){
                cnt++;
                s++;
                en--;
            } else{
                s++;
            }
        }

        System.out.println(cnt);
    }
}
