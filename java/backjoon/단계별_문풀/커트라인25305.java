package 단계별_문풀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 커트라인25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());

        int arr[]=new int[N];
        st= new StringTokenizer(br.readLine());
        for (int i=0; i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        //아니면 내림차순
        //Arrays.sort(arr,Collections.reverserOrder())
        //System.out.print(arr[k-1]);
        System.out.println(arr[N-K]);


    }
}
