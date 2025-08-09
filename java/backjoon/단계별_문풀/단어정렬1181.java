package 단계별_문풀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;

public class 단어정렬1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String arr [] = new String[N];

        for (int i=0; i<N; i++){
            arr[i]=br.readLine();
        }
        Arrays.sort(arr,new Comparator<String>(){//또한 int를 쓰는 이유는 int를 통해서 양수 음수 0으로 3가지표현 가능
            public int compare(String s1, String s2){ //compare은 비교함수, Comparator을 인터페이스로 구현한후 해야함
                if (s1.length() == s2.length()){
                    return s1.compareTo(s2); //사전 순서에 따라 비교
                }
                else {
                    return s1.length() - s2.length(); //아니라면 글자수 오름차순
                }
            }
        });
//        StringBuilder sb = new StringBuilder();
//
//        sb.append(arr[0]).append("\n");
//
//        for (int i =1; i<N; i++){
//            if(!arr[i].equals(arr[i-1])){
//                sb.append(arr[i]).append("\n");
//            }
//        }
//        System.out.println(sb);
        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>(); //HashSet은 중복제거 순서x
        for (String s:arr){                                    //LinkedHashSet은 중복제거 순서o
            uniqueWords.add(s);
        }
        StringBuilder sb = new StringBuilder();
        for(String s: uniqueWords){
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}
