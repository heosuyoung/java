import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주몽1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int arr[]=new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int cnt=0,start_index=0,end_index=N-1;
        while(start_index<end_index){
            int sum = arr[start_index]+arr[end_index];
            if (sum==M){
                cnt++;
                start_index++;
                end_index--;
            } else if (sum>M) {

                end_index--;

            } else if (sum<M) {
                start_index++;

            }

        }
        System.out.println(cnt);

    }
}
