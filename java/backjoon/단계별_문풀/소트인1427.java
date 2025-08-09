package 단계별_문풀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class 소트인1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char arr []=br.readLine().toCharArray();
        //Arrays.sort(arr, Collections.reverseOrder()); //char일때 사용불가능
        Arrays.sort(arr);
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }

    }
}
