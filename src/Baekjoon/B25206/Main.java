//25206 basic
package Baekjoon.B25206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        double score_sum = 0;

        for(int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String major = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if(grade.equals("A+")) {
                sum += score * 4.5;
                score_sum += score;
            } else if(grade.equals("A0")) {
                sum += score * 4.0;
                score_sum += score;
            } else if(grade.equals("B+")) {
                sum += score * 3.5;
                score_sum += score;
            } else if(grade.equals("B0")) {
                sum += score * 3.0;
                score_sum += score;
            } else if(grade.equals("C+")) {
                sum += score * 2.5;
                score_sum += score;
            } else if(grade.equals("C0")) {
                sum += score * 2.0;
                score_sum += score;
            } else if(grade.equals("D+")) {
                sum += score * 1.5;
                score_sum += score;
            } else if(grade.equals("D0")) {
                sum += score * 1.0;
                score_sum += score;
            } else if(grade.equals("F")) {
                sum += score * 0.0;
                score_sum += score;
            }
        }

        System.out.printf("%.6f", sum / score_sum);
    }
}
