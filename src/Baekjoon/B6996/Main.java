//6996 string(sort)
package Baekjoon.B6996;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();
            char[] a = A.toCharArray();
            char[] b = B.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            if(Arrays.equals(a, b)){
                System.out.println(A + " & " + B + " are anagrams.");
            } else {
                System.out.println(A + " & " + B + " are NOT anagrams.");
            }
        }

    }
}
