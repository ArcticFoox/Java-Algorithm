package Baekjoon.B10822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = br.readLine().split(",");
        int sum = 0;
        for(String num : numbers) {
            sum += Integer.parseInt(num.trim());
        }

        System.out.println(sum);
    }
}
