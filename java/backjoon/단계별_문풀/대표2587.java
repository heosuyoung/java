package 단계별_문풀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class 대표2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum=0;
        int arr[] = new int[5];
        for (int i=0; i<5;i++){
            arr[i]=Integer.parseInt(br.readLine());
            sum+=arr[i];
        }
        sb.append(sum/5).append("\n");
        Arrays.sort(arr);
        sb.append(arr[2]);
        System.out.println(sb);
    }
}
