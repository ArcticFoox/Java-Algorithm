//2083 basic
package Baekjoon.B2083;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while(true){
            String input = br.readLine();
            if(input.startsWith("#")) break;

            st = new StringTokenizer(input);
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            sb.append(name).append(" ");
            if(age > 17 || weight >= 80){
                sb.append("Senior").append('\n');
            }
            else{
                sb.append("Junior").append('\n');
            }

        }

        System.out.println(sb);
    }
}
