//1100 basic
package Baekjoon.B1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;

        for(int i = 0; i < 8; i++){
            String str = br.readLine();
            for(int j = 0; j < 8; j++){
                if(str.charAt(j) == 'F'){
                    if(i % 2 == 0 && j % 2 == 0){
                        cnt++;
                    }

                    if(i % 2 == 1 && j % 2 == 1){
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}
