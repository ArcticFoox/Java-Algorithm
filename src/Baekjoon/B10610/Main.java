//10610 greedy
package Baekjoon.B10610;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int sum = 0;

        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        int len = arr.length;

        StringBuilder sb = new StringBuilder();
        for(int i = len - 1; i >= 0; i--) {
            int num = arr[i] - '0';
            sum += num;
            sb.append(sum);
        }

        // 각 원소를 전부 더한 값이 3의 배수이며 0이 존재해야함
        if(arr[0] != '0' || sum % 3 != 0){
            System.out.println(-1);
            return;
        }

        System.out.println(sb);
    }
}
