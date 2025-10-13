//1236 implementation
package Baekjoon.B1236;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] arr = new char[n][m];

        for(int i = 0; i < n; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        int row = 0;
        int col = 0;

        for(int i = 0; i < n; i++) {
            boolean check = false;
            for(int j = 0; j < m; j++) {
                if(arr[i][j] == 'X') {
                    check = true;
                    break;
                }
            }
            if(!check) row++;
        }

        for(int j = 0; j < m; j++) {
            boolean check = false;
            for(int i = 0; i < n; i++) {
                if(arr[i][j] == 'X') {
                    check = true;
                    break;
                }
            }
            if(!check) col++;
        }

        System.out.print(Math.max(row, col));
    }
}
