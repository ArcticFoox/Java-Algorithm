//4796 greedy
package Baekjoon.B4796;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            if(L == 0 && P == 0 && V == 0){
                break;
            }

            int days = (V / P) * L;

            if((V % P) < L){
                days += V % P;
            }
            else{
                days += L;
            }

            System.out.println("Case "+ i + ": " + days);
            i++;
        }
    }
}
