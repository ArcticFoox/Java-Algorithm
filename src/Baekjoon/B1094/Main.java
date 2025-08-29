//1094 math&bitmask
package Baekjoon.B1094;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        bitmask(X);
        bitmask2(X);

        int cnt = 0;
        int stick = 64;
        while(X > 0){
            if(stick <= X){
                X -= stick;
                cnt++;
            }
            stick /= 2;
        }

        System.out.println(cnt);
    }

    static void bitmask(int X){
        int cnt = 0;

        for(int i = 0; i < 7; i++){
            if((X & (1 << i)) != 0) cnt++;
        }

        System.out.println(cnt);
    }

    static void bitmask2(int X){
        int cnt = 0;

        while(X > 0){
            if((X & 1) == 1) cnt++;
            X >>= 1;
        }

        System.out.println(cnt);
    }
}
