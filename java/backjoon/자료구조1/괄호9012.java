package 자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T;i++){
            sb.append(solve(br.readLine())).append("\n");
        }
        System.out.println(sb);

    }
    public static String solve(String s){
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length();i++){
            char c = s.charAt(i);

            if (c=='('){
                stack.push(c);
            }
            //스택이 비어있는 경우 )가 나온다면 당연히 NO
            else if (stack.empty()){
                return "NO";
            }
            //아니라면 pop을해서 stack에 들어있는 (빼면 됨
            else {
                stack.pop();
            }
        }
        //다 했는데 stack에 남아있는게 있으면 그것또한 NO
        if (stack.empty()){
            return "YES";
        }
        else return "NO";
    }
}
