package Baekjoon.B5525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int ans = 0;
        String str = br.readLine();

        for(int i = 0; i < M; i++){
            int cnt = 0;

            if(str.charAt(i) == 'O') continue;

            while (i + 2 < M && str.charAt(i + 1) == 'O' && str.charAt(i + 2) == 'I') {
                cnt++;

                if (cnt == N) {
                    ans++;
                    cnt--;
                }
                i += 2;
            }

        }

        System.out.println(ans);
    }
}
