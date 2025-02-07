package Softeer.S6273;

import java.io.*;
import java.util.*;

public class Main {

    public static int[] arr;
    public static int n, m, k;
    public static boolean[] visited;
    public static int ans = 987654321;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n];
        visited = new boolean[n];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        back(0, new int[n]);

        System.out.println(ans);
    }

    public static void back(int row, int[] tmp){
        if(row == n){
            int total = 0;
            int idx = 0;
            for(int i = 0; i < k; i++){
                int sum = 0;
                while(sum + tmp[idx] <= m){
                    sum += tmp[idx];
                    idx = (idx + 1) % n;
                }
                total += sum;
            }

            ans = Math.min(total, ans);
            return;
        }

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                visited[i] = true;
                tmp[row] = arr[i];
                back(row + 1, tmp);
                visited[i] = false;
            }
        }
    }
}