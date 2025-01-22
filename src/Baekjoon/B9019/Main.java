package Baekjoon.B9019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {
            //0 - 10000 미만
            Queue<Integer> queue = new LinkedList<>();
            boolean[] visited = new boolean[10000];
            String[] comd = new String[10000];

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            queue.add(a);
            visited[a] = true;
            Arrays.fill(comd, "");

            while (!queue.isEmpty() && !visited[b]) {
                int now = queue.poll(); // 큐에서 값을 뺀다 = 현재 탐색 위치

                int D = (2 * now) % 10000; // n을 두배로 바꾸고 10000으로 나눈 나머지
                int S = now == 0 ? 9999 : now - 1; // 0일 때, 9999, 아니면 1을 빼준다
                int L = (now % 1000) * 10 + now / 1000; // 1234 -> 2341 : 1234를 1000으로 나눈 나머지(234)에 10을 곱함=2340, 1234를 1000으로 나누면 1, 2340+1=2341
                int R = (now % 10) * 1000 + now / 10; // 1234 -> 4123 : 1234를 10으로 나눈 나머지에 1000 곱합 = 4000, 1234를 10으로 나누면 123, 4000+123=4123

                if (!visited[D]) {
                    queue.add(D); // 큐에 넣는다
                    visited[D] = true; // 방문처리한다
                    comd[D] = comd[now] + "D"; // 명령어를 추가한다
                }

                if (!visited[S]) {
                    queue.add(S);
                    visited[S] = true;
                    comd[S] = comd[now] + "S";
                }

                if (!visited[L]) {
                    queue.add(L);
                    visited[L] = true;
                    comd[L] = comd[now] + "L";
                }

                if (!visited[R]) {
                    queue.add(R);
                    visited[R] = true;
                    comd[R] = comd[now] + "R";
                }
            }
            System.out.println(comd[b]);
        }
    }
}
