//2346 deque
package Baekjoon.B2346;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer[]> deque = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append("1 ");
        int move = Integer.parseInt(st.nextToken());
        for (int i = 1; i < N; i++) {
            deque.add(new Integer[]{i + 1, Integer.parseInt(st.nextToken())});
        }

        while (!deque.isEmpty()) {
            if (move > 0) {
                for (int i = 1; i < move; i++) {
                    deque.add(deque.poll());
                }

                Integer[] current = deque.poll();
                sb.append(current[0]).append(" ");
                move = current[1];

            } else {
                for (int i = 1; i < -move; i++) {
                    deque.addFirst(deque.pollLast());
                }

                Integer[] current = deque.pollLast();
                sb.append(current[0]).append(" ");
                move = current[1];
            }
        }

        System.out.println(sb);
    }
}
