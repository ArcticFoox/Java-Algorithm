//10419 basic
package Baekjoon.B10419;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int ans = 0;
            int time = Integer.parseInt(br.readLine());
            for(int j = 1; j * j < time; j++){
                if(time - (j + j*j) >= 0){
                    ans = j;
                }
            }

            System.out.println(ans);
        }
    }
}
