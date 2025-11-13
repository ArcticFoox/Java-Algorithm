//17388 basic
package Baekjoon.B17388;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = Integer.MAX_VALUE;
        int idx = -1;
        int sum = 0;

        for(int i = 0; i < 3; i++){
            int score = Integer.parseInt(st.nextToken());
            sum += score;
            if(score < min){
                min = score;
                idx = i;
            }
        }

        if(sum < 100){
            if(idx == 0){
                System.out.println("Soongsil");
            }else if(idx == 1){
                System.out.println("Korea");
            }else{
                System.out.println("Hanyang");
            }
        }
        else{
            System.out.println("OK");
        }
    }
}
