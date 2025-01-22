package Baekjoon.B11404;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[][] map = new int[n + 1][n + 1];
        int a, b, c;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == j) {
                    map[i][j] = 0;
                    continue;
                }

                map[i][j] = 10000000;
            }
        }

        for(int i = 0; i < m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            map[a][b] = Math.min(map[a][b], c);
        }

        for(int k = 1; k <= n; k++){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    map[i][j] = Math.min(map[i][k] + map[k][j], map[i][j]);
                }
            }
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(map[i][j] == 10000000) {
                    sb.append(0).append(' ');
                    continue;
                }
                sb.append(map[i][j]).append(' ');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
