//26069 hashset
package Baekjoon.B26069;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;
        String a, b;

        HashSet<String> set = new HashSet();
        set.add("ChongChong");

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            a = st.nextToken();
            b = st.nextToken();

            if(set.contains(a) || set.contains(b)){
                set.add(a);
                set.add(b);
            }
        }

        sb.append(set.size());
        System.out.println(sb);
    }
}
