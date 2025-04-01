//3613 string
package Baekjoon.B3613;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        if (str.charAt(0) <= '_' || str.charAt(str.length() - 1) == '_') {
            System.out.println("Error!");
            return;
        }

        boolean cpp = false;
        boolean java = false;
        char pre = str.charAt(0);
        for (char c : str.toCharArray()) {
            if(c <= 'Z'){
                if(java){
                    System.out.println("Error!");
                    return;
                }
                cpp = true;
            }

            if(c == '_'){
                if(cpp || pre == '_'){
                    System.out.println("Error!");
                    return;
                }
                java = true;
            }
            pre = c;
        }

        if(java){
            boolean next = false;
            for (char c : str.toCharArray()) {
                if(next){
                    sb.append(String.valueOf(c).toUpperCase());
                    next = false;
                } else{
                    if(c == '_'){
                        next = true;
                    }
                    else{
                        sb.append(c);
                    }
                }
            }
        }
        else{
            for (char c : str.toCharArray()) {
                if(c <= 'Z'){
                    sb.append("_").append(String.valueOf(c).toLowerCase());
                }
                else{
                    sb.append(c);
                }
            }
        }

        System.out.println(sb);
    }
}
