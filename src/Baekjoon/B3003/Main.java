//5003 basic
package Baekjoon.B3003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] chessPieces = {1, 1, 2, 2, 2, 8}; // 각 종류의 체스 말 개수
        int[] inputPieces = new int[6]; // 입력받은 체스 말 개수


        // 입력 받기
        for (int i = 0; i < 6; i++) {
            inputPieces[i] = Integer.parseInt(st.nextToken());
        }

        // 결과 출력
        for (int i = 0; i < 6; i++) {
            System.out.print(chessPieces[i] - inputPieces[i] + " ");
        }
    }
}
