package 단계별_문풀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sugar2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer=0;
        while(N>0){
            if (N%5==0){
                answer+=N/5;
                System.out.println(answer);
                return;
            }
            if (N<3){
                System.out.println(-1);
                return;
            }
            N-=3;
            answer++;
        }
        System.out.println(answer);
    }
}
