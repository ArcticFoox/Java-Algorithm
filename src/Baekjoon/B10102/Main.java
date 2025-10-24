//10102 basic
package Baekjoon.B10102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String votes = br.readLine();
        int aCount = 0;
        int bCount = 0;

        for(int i = 0; i < n; i++){
            char c = votes.charAt(i);
            if(c == 'A'){
                aCount++;
            } else {
                bCount++;
            }
        }

        if(aCount > bCount){
            System.out.println("A");
        } else if(bCount > aCount){
            System.out.println("B");
        } else {
            System.out.println("Tie");
        }
    }
}
