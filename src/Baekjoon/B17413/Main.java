package Baekjoon.B17413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    // <> 안은 그대로 출력
    // ' ' 로 단어를 나눔
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        String str = br.readLine();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '<'){
                while(!stack.empty()){
                    sb.append(stack.pop());
                }
                while(true){
                    sb.append(str.charAt(i));
                    if(str.charAt(i) == '>') break;
                    i++;
                }
            } else if (str.charAt(i) == ' ') {
                while(!stack.empty()){
                    sb.append(stack.pop());
                }
                sb.append(' ');
            } else {
                stack.push(str.charAt(i));
            }
        }

        while(!stack.empty()){
            sb.append(stack.pop());
        }

        System.out.println(sb);
    }
}
