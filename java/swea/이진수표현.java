import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 이진수표현 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        for (int i=0;i<TC;i++){
            StringTokenizer st =new StringTokenizer(br.readLine());
            int N=Integer.parseInt(st.nextToken());
            int M=Integer.parseInt(st.nextToken());

            int bit =(1<<N)-1;
            if ((M&bit) == bit){
                System.out.println("#"+ i +" ON");


            }
            else {
                System.out.println("#"+ i + " OFF");
            }
        }

    }
}
