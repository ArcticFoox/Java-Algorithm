//1145 bruteforce
package Baekjoon.B1145;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[5];
        for(int i = 0; i < 5; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i = arr[0]; i <= arr[2] * arr[3] * arr[4]; i++){
            int cnt = 0;
            for(int j = 0; j < 5; j++){
                if(i % arr[j] == 0){
                    cnt++;
                }
            }
            if(cnt >= 3){
                System.out.println(i);
                break;
            }
        }
    }
}
