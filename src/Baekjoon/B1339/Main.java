//1339 greedy
package Baekjoon.B1339;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[26];

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < str.length(); j++){
                char c = str.charAt(j);
                arr[c - 'A'] += (int)Math.pow(10, str.length() - j - 1);
            }
        }

        Arrays.sort(arr);

        int num = 9;
        int idx = 25;
        int sum = 0;
        while(arr[idx] != 0){
            sum += arr[idx] * num;
            num--;
            idx--;
        }

        System.out.println(sum);
    }
}
