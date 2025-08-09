package 단계별_문풀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class movie1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int num=666;
        int count=1;

        while(count!=N){
            num++;
            if (String.valueOf(num).contains("666")){ //숫자는 contains안됨 문자열로 바꿔서해야함
                count++;    //숫자를 문자열로 바꾸는 String.valueOf를 써야함
            }
        }
        System.out.println(num);
    }

}
