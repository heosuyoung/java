package 투포인터;//sum ==N 이면 cnt증가, end_index증가,sum값(end_index만큼) 변경
//        sum>N이면 sum값 변경(start_index만큼빼고),start_index증가
//        sum<N이면 end_index증가,sum값 변경


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//숫자 2개를 찾을때는 보통 정렬후 양끝에서 투포인터
//구간을 찾을떄는 같은 시작점으로해서 구간을 넓히고 줄임
public class 수들의합2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum=1,cnt=1,start_index=1,end_index=1; //while end_index!=N하므로 미리 N을 세어둠 그래서 cnt=1
        while(end_index!=N){
            if (sum==N){
                cnt+=1;
                end_index+=1;
                sum+=end_index;
            } else if (sum>N) {
                sum-=start_index;
                start_index+=1;

            } else if (sum<N) {
                end_index+=1;
                sum+=end_index;

            }

        }
        System.out.println(cnt);
    }

}
