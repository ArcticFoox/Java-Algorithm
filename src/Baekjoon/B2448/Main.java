package Baekjoon.B2448;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static char[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        map = new char[N][N * 2 - 1];
        for(int i = 0; i < N; i++) {
            Arrays.fill(map[i], ' ');
        }

        star(0, N-1, N);

        for(int i = 0; i < N; i++){
            for(int j = 0; j < 2 * N - 1; j++){
                sb.append(map[i][j]);
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

    public static void star(int x, int y, int n){
        if(n == 3){
            map[x][y] = '*';
            map[x + 1][y - 1] = '*';
            map[x + 2][y - 2] = '*';
            map[x + 2][y - 1] = '*';
            map[x + 2][y] = '*';
            map[x + 2][y + 1] = '*';
            map[x + 2][y + 2] = '*';
            map[x + 1][y + 1] = '*';
            return;
        }

        star(x, y, n / 2);
        star(x + n / 2, y - n / 2, n / 2);
        star(x + n / 2, y + n / 2, n / 2);
    }
}
