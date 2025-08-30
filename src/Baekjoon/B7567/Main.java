//7567 string(stack)
package Baekjoon.B7567;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int len = str.length();
        int result = 10;
        char prev = str.charAt(0);

        for(int i = 1; i < len; i++){
            if(str.charAt(i) == prev){
                result += 5;
            } else {
                result += 10;
            }
            prev = str.charAt(i);
        }

        System.out.println(result);

    }
}
