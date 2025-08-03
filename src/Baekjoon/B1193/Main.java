//1193 math
package Baekjoon.B1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        int squareCnt = 1;
        int squareSum = 0;

        while(true) {
            if(x <= squareSum + squareCnt) {
                if(squareSum % 2 == 1) {
                    System.out.println((squareCnt - (x - squareSum - 1) + "/" + (x - squareSum)));
                    break;
                } else {
                    System.out.println((x - squareSum) + "/" + (squareCnt - (x - squareSum - 1)));
                    break;
                }
            } else {
                squareSum += squareCnt;
                squareCnt++;
            }
        }
    }
}
