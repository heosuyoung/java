package 자료구조1;

import java.io.*;
import java.util.*;

public class 에디터1406 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        int M = Integer.parseInt(br.readLine());

        Stack<Character> leftSt= new Stack<>();
        Stack<Character> rightSt= new Stack<>();

        for (char ch: str.toCharArray()){ //toCharArray로 String을 char로 수정
            leftSt.push(ch);
        }
        for (int i=0; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char command =st.nextToken().charAt(0);

            switch (command){
                case 'L':
                    if (!leftSt.isEmpty()){
                        rightSt.push(leftSt.pop());
                    }
                    break;
                case 'D':
                    if (!rightSt.isEmpty()){
                        leftSt.push(rightSt.pop());
                    }
                    break;
                case 'B':
                    if (!leftSt.isEmpty()){
                        leftSt.pop();
                    }
                    break;
                case 'P':
                    char addChar=st.nextToken().charAt(0);
                    leftSt.push(addChar);
                    break;

            }
        }
        StringBuilder sb = new StringBuilder();
        while (!leftSt.isEmpty()){
            rightSt.push(leftSt.pop()); //leftSt내용을 rightSt로 옮겨서 역순으로 만듬
        }
        while (!rightSt.isEmpty()){
            sb.append(rightSt.pop());
        }
        System.out.println(sb.toString());

    }
}
