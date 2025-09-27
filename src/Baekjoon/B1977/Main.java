//1977 bruteforce
package Baekjoon.B1977;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int cur = 1;
        int min = 0;
        int sum = 0;
        while(true){
            if(cur * cur >= n && cur * cur <= m){
                sum += cur * cur;
                if(min == 0){
                    min = cur * cur;
                }
            }

            if(cur * cur > m){
                break;
            }
            cur++;
        }

        if(min == 0){
            System.out.println(-1);
            return;
        }
        System.out.println(sum);
        System.out.println(min);
    }
}
