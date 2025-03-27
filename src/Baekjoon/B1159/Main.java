//1159 map
package Baekjoon.B1159;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        TreeMap<Character, Integer> map = new TreeMap<>();

        for(int i = 0; i < N; i++) {
            String s = br.readLine();

            if(map.containsKey(s.charAt(0))){
                map.put(s.charAt(0), map.get(s.charAt(0)) + 1);
            }
            else{
                map.put(s.charAt(0), 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        boolean flag = false;

        for(char c : map.keySet()){
            if(map.get(c) >= 5){
                sb.append(c);
                flag = true;
            }
        }

        if(flag){
            System.out.println(sb);
        }
        else{
            System.out.println("PREDAJA");
        }
    }
}
