//2851 math
package Baekjoon.B2851;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int closest = 0;

        for(int i = 0; i < 10; i++){
            sum += Integer.parseInt(br.readLine());

            if(Math.abs(100 - sum) <= Math.abs(100 - closest)){
                closest = sum;
            }
        }

        System.out.println(closest);
    }
}
