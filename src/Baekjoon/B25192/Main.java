//25192 map
package Baekjoon.B25192;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = 0;

        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (s.equals("ENTER")) {
                set.clear();
            } else {
                if (set.contains(s)) continue;
                set.add(s);
                num++;
            }
        }
        System.out.println(num);
    }
}
