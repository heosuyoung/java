import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class 숫자합11720 {
    public static void main(String[] args) throws IOException {
        int sum=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String num = br.readLine();

        for (int i=0; i<N; i++){
            sum+= num.charAt(i)-48; // -'0'
        }
        System.out.println(sum);
    }
}
