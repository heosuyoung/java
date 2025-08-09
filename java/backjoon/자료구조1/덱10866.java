package 자료구조1;

import java.io.*;
import java.util.*;

public class 덱10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<Integer> deq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++){
            String[] s = br.readLine().split(" ");

            switch (s[0]){

                case "push_front":
                    deq.addFirst(Integer.parseInt(s[1]));
                    break;

                case "push_back":
                    deq.addLast(Integer.parseInt(s[1]));
                    break;

                case "pop_front":
                    if (deq.isEmpty()){
                        sb.append(-1).append("\n");
                    }
                    else
                        sb.append(deq.pollFirst()).append("\n");
                    break;
                case "pop_back":
                    if (deq.isEmpty()){
                        sb.append(-1).append("\n");
                    }
                    else
                        sb.append(deq.pollLast()).append("\n");
                    break;
                case "size":
                    sb.append(deq.size()).append("\n");
                    break;
                case "empty":
                    if (deq.isEmpty())
                        sb.append(1).append("\n");
                    else
                        sb.append(0).append("\n");
                        break;

                case "front":
                    if (deq.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(deq.peekFirst()).append("\n");
                    break;
                case "back":
                    if (deq.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(deq.peekLast()).append("\n");
                    break;


            }
        }


        System.out.println(sb);
    }
}
