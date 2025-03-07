//1476 basic
package Baekjoon.B1476;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int cur_e = 0;
        int cur_s = 0;
        int cur_m = 0;
        int cnt = 0;

        while(true){
            cnt++;
            cur_e++;
            cur_s++;
            cur_m++;
            if(cur_e == 16) cur_e = 1;
            if(cur_s == 29) cur_s = 1;
            if(cur_m == 20) cur_m = 1;
            if(cur_e == E && cur_s == S && cur_m == M){
                break;
            }
        }

        System.out.println(cnt);
    }
}
