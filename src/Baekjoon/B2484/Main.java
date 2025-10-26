//2484 counting
package Baekjoon.B2484;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int max = 0;

        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            int[] count = new int[7];
            for(int j = 0; j < 4; j++){
                int num = Integer.parseInt(st.nextToken());
                count[num]++;
            }

            int prize = 0;
            for(int j = 1; j <= 6; j++){
                if(count[j] == 4){
                    prize = 50000 + j * 5000;
                    break;
                } else if(count[j] == 3){
                    prize = 10000 + j * 1000;
                    break;
                } else if(count[j] == 2){
                    if(prize < 1000){
                        prize = 1000 + j * 100;
                    } else {
                        prize = 2000 + (prize - 1000) * 5 + j * 500;
                        break;
                    }
                } else if(count[j] == 1){
                    if(prize < j * 100){
                        prize = j * 100;
                    }
                }
            }

            if(prize > max){
                max = prize;
            }
        }
        System.out.println(max);
    }
}
