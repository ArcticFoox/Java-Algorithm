//1417 greedy(priority_queue)
package Baekjoon.B1417;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);

        int dasom = Integer.parseInt(br.readLine());

        for (int i = 1; i < N; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        int cnt = 0;

        while (!pq.isEmpty() && pq.peek() >= dasom) {
            int top = pq.poll();
            top--;
            dasom++;
            pq.add(top);
            cnt++;
        }

        System.out.println(cnt);
    }
}
