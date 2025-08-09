package 자료구조1;

import java.io.*;
import java.util.*;
//public class 단어뒤집기 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        for (int i=0; i<N; i++){
//            String[] words = br.readLine().split(" ");
//
//            for (String word:words){
//                StringBuilder sb = new StringBuilder(word);
//                System.out.print(sb.reverse().toString() + " ");
//            }
//        }
//        System.out.println();
//    }
//}
public class 단어뒤집기9093 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        for (int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                StringBuilder sb = new StringBuilder(st.nextToken());
                answer.append(sb.reverse()+" ");
            }
            answer.append("\n");
        }
        System.out.println(answer);

    }
}