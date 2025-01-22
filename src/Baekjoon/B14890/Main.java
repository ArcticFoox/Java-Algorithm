package Baekjoon.B14890;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n, l;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());
        arr = new int[n][n];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(calRow(i)) cnt++;
            if(calCol(i)) cnt++;
        }
        System.out.println(cnt);
    }

    public static boolean calRow(int row){
        boolean[] slope = new boolean[n];

        for(int i = 0; i < n - 1; i++){
            int diff = arr[row][i] - arr[row][i + 1];

            if(diff > 1 || diff < -1) return false;
            if(diff == - 1){
                for(int j = 0; j < l; j++){
                    if(i - j < 0 || slope[i - j]) return false;
                    if(arr[row][i] != arr[row][i - j]) return false;
                    slope[i - j] = true;
                }
            }
            if(diff == 1){
                for(int j = 1; j < l; j++){
                    if(i + j >= n || slope[i + j]) return false;
                    if(arr[row][i] - 1 != arr[row][i + j]) return false;
                    slope[i + j] = true;
                }
            }
        }

        return true;
    }

    public static boolean calCol(int col){
        boolean[] slope = new boolean[n];

        for(int i = 0; i < n - 1; i++){
            int diff = arr[i][col] - arr[i + 1][col];

            if(diff > 1 || diff < -1) return false;
            if(diff == - 1){
                for(int j = 0; j < l; j++){
                    if(i - j < 0 || slope[i - j]) return false;
                    if(arr[i][col] != arr[i - j][col]) return false;
                    slope[i - j] = true;
                }
            }
            if(diff == 1){
                for(int j = 1; j < l; j++){
                    if(i + j >= n || slope[i + j]) return false;
                    if(arr[i][col] - 1 != arr[i + j][col]) return false;
                    slope[i + j] = true;
                }
            }
        }

        return true;
    }
}
