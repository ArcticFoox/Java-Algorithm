//1789 greedy
package Baekjoon.B1789;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long S;
    static int ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        S = Long.parseLong(br.readLine());

        long num = 0;
        int idx = 1;

        while(true) {
            if(num > S) break;
            num += idx++;
            ans++;
        }

        System.out.println(ans - 1); //S보다 큰 값을 찾은 다음 1 ~ 10 중에서 하나만 빼면 된다.
    }
}
