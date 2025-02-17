//1744 greedy(priorityqueue)
package Baekjoon.B1744;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> plusq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minusq = new PriorityQueue<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if(num > 0){
                plusq.add(num);
            } else {
                minusq.add(num);
            }
        }

        int sum = 0;

        // 양수의 경우
        while(plusq.peek() != null) {
            Integer num1 = plusq.poll();
            Integer num2 = plusq.poll();

            if (num2 == null) { // 하나밖에 안 남았다면
                sum += num1;
            } else if (num2 == 1) { // 하나가 1이라면
                sum += num1;
                plusq.offer(num2); // 1은 다시 집어 넣는다
            } else {
                sum += num1*num2;
            }
        }

        // 음수의 경우
        while(minusq.peek() != null) {
            Integer num1 = minusq.poll();
            Integer num2 = minusq.poll();

            if (num2 != null) {
                sum += num1*num2;
            } else {
                sum += num1;
            }
        }

        System.out.println(sum);
    }
}
