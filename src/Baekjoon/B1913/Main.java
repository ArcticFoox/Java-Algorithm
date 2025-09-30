//1913 implementation
package Baekjoon.B1913;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N];
        int x = 0, y = 0;
        int cur = N * N;
        int dir = 0;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int ansX = 0, ansY = 0;

        while(cur > 0){
            arr[x][y] = cur;
            if(cur == num){
                ansX = x + 1;
                ansY = y + 1;
            }
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(nx < 0 || nx >= N || ny < 0 || ny >= N || arr[nx][ny] != 0){
                dir = (dir + 1) % 4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }

            x = nx;
            y = ny;
            cur--;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }

        sb.append(ansX).append(" ").append(ansY);
        System.out.println(sb);
    }
}
