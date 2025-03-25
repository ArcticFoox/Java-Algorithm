//2864 basic
package Baekjoon.B2864;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        String A_min = "";
        String A_max = "";
        String  B_min = "";
        String  B_max = "";

        for(int i = 0; i < A.length(); i++) {
            if(A.charAt(i) == '5' || A.charAt(i) == '6') {
                A_max += '6';
                A_min += '5';
            }
            else{
                A_max += A.charAt(i);
                A_min += A.charAt(i);
            }
        }

        for(int i = 0; i < B.length(); i++) {
            if(B.charAt(i) == '5' || B.charAt(i) == '6') {
                B_max += '6';
                B_min += '5';
            }
            else{
                B_max += B.charAt(i);
                B_min += B.charAt(i);
            }
        }

        int min = Integer.parseInt(A_min) + Integer.parseInt(B_min);
        int max = Integer.parseInt(A_max) + Integer.parseInt(B_max);

        System.out.println(min + " " + max);
    }
}
