//11536 string(sort)
package Baekjoon.B11536;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < n; i++) {
            if (arr[i].compareTo(arr[i - 1]) > 0) {
                descending = false;
            } else if (arr[i].compareTo(arr[i - 1]) < 0) {
                ascending = false;
            }
        }

        if (ascending) {
            System.out.println("INCREASING");
        } else if (descending) {
            System.out.println("DECREASING");
        } else {
            System.out.println("NEITHER");
        }
    }
}
