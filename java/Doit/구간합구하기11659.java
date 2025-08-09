import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//r과m입력받고
//for문 n번돌려서 배열에 값넣고
//for문 m번 돌려서 값받고
//안에 2중 for뮨써서 i와 j받아서 출력값들 sb에 쌓기
public class 구간합구하기11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N= Integer.parseInt(st.nextToken());
        int M= Integer.parseInt(st.nextToken());
        long arr[]= new long[N+1];
        st=new StringTokenizer(br.readLine());
        for (int i=1; i<=N;i++){
            arr[i]=arr[i-1]+Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for (int a=0; a<M;a++){
            st=new StringTokenizer(br.readLine());
            int i=Integer.parseInt(st.nextToken());
            int j=Integer.parseInt(st.nextToken());
            sb.append(arr[j]-arr[i-1]).append("\n");
        }
        System.out.println(sb);

    }
}
