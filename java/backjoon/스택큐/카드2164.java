package 스택큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 카드2164 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> myQueue= new LinkedList<>();
        for (int i=1;i<=N;i++){
            myQueue.add(i);
        }
        while(myQueue.size()>1){
            myQueue.poll();//맨위 카드 버리기
            myQueue.add(myQueue.poll());//카드 맨 앞에 추가하기
        }
        System.out.println(myQueue.poll());


    }
}
