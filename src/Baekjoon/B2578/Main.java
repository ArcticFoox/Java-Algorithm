//2578 bruteforce
package Baekjoon.B2578;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] bingo = new int[5][5];
    static boolean[][] checked = new boolean[5][5];
    static int row = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;

        for(int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 5; j++) {
                cnt++;
                bingo(Integer.parseInt(st.nextToken()));
                bingoCheck();
                if(row >= 3) {
                    System.out.println(cnt);
                    return;
                }
            }
        }
    }

    static void bingo(int n){
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(n == bingo[i][j]) {
                    checked[i][j] = true;
                    return;
                }
            }
        }
    }

    static void bingoCheck() {
        int bingoCnt = 0;

        for(int i = 0; i < 5; i++) {
            int rowCnt = 0;
            int colCnt = 0;
            for(int j = 0; j < 5; j++) {
                if(checked[i][j]) rowCnt++;
                if(checked[j][i]) colCnt++;
            }
            if(rowCnt == 5) bingoCnt++;
            if(colCnt == 5) bingoCnt++;
        }

        int diag1Cnt = 0;
        int diag2Cnt = 0;
        for(int i = 0; i < 5; i++) {
            if(checked[i][i]) diag1Cnt++;
            if(checked[i][4 - i]) diag2Cnt++;
        }
        if(diag1Cnt == 5) bingoCnt++;
        if(diag2Cnt == 5) bingoCnt++;

        row = bingoCnt;
    }
}
