//1173 implementation
package Baekjoon.B1173;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        int res = 0;
        int move = 0;
        int init_m = m;

        while(move != N) {
            res++;

            if(m + T <= M) {
                m += T;
                move++;
            } else {
                m -= R;

                if(m < init_m) m = init_m;
            }

            if((m + T > M) && (m == init_m))
                break;
        }

        if(move != N)
            System.out.println(-1);
        else
            System.out.println(res);
    }
}
