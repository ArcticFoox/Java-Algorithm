//2504 stack
package Baekjoon.B2504;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        Stack<Character> stack = new Stack<>();

        int ans = 0, tmp = 1;

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c == '('){
                stack.push(c);
                tmp *= 2;
            } else if (c == '[') {
                stack.push(c);
                tmp *= 3;

            } else if (c == ')') {
                if(stack.isEmpty() || !stack.peek().equals('(')){
                    ans = 0;
                    break;
                } else if(str.charAt(i-1) == '('){
                    ans += tmp;
                    tmp /= 2;
                    stack.pop();
                } else{
                    tmp /= 2;
                    stack.pop();

                }
            } else if (c == ']') {
                if(stack.isEmpty() || !stack.peek().equals('[')){
                    ans = 0;
                    break;
                } else if(str.charAt(i-1) == '[') {
                    ans += tmp;
                    tmp /= 3;
                    stack.pop();
                } else{
                    tmp /= 3;
                    stack.pop();
                }
            }
        }

        if(!stack.isEmpty()){
            ans = 0;
        }
        System.out.println(ans);
    }
}
