//1497 bitmask
package Baekjoon.B1497;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static long[] state;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        state = new long[N];

        Arrays.fill(state, 0L);

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String tmp = st.nextToken();

            for(int j = M-1; j >= 0; j--) {
                state[i] = (state[i] << 1) | (tmp.charAt(j) == 'Y' ? 1 : 0);
            }
        }

        Pair ans = new Pair(0, -1);
        for(int tmp = 0; tmp < (1 << N); tmp++) {
            long comb = 0;
            for(int i = 0; i < N; i++) {
                if((tmp & (1L << i)) == 0) continue;
                comb |= state[i];
            }

            int song_num = bit_cnt(comb);
            int guitar_num = bit_cnt(tmp);
            if(ans.x < song_num){
                ans.x = song_num;
                ans.y = guitar_num;
            }
            else if(ans.x == song_num && ans.y > guitar_num){
                ans.x = song_num;
                ans.y = guitar_num;
            }
        }

        System.out.println(ans.y);
    }

    static int bit_cnt(long x){
        int ret = 0;
        for(int i = 0; i < Math.max(N, M); i++){
            ret += (x >> i) & 1;
        }
        return ret;
    }

    static class Pair {
        int x, y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
