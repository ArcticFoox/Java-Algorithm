//11365 string
package Baekjoon.B11365;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String str = br.readLine();
            if(str.equals("END")) {
                break;
            }

            sb.append(new StringBuffer(str).reverse()).append("\n");
        }

        System.out.print(sb);
    }
}
