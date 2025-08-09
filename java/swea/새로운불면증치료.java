import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 새로운불면증치료 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        int allVisitedMask = (1 << 10) -1;

        for (int i=1;i<=testcase;i++){
            int N = Integer.parseInt(br.readLine());
            int currentVisitedMask=0; //현재까지 등장한 숫자를 기록하는 비트마스크
            long currentNumber=0; // N*count값을 저장할변수
            int count =0;

            for (count=1; ; count++){
                currentNumber = (long)N*count; //N*count계산
                char[] digits = String.valueOf(currentNumber).toCharArray(); //숫자를 문자 배열로 전환

                for (char digitChar : digits){
                    int num = digitChar -'0'; //char를 int로 변환
                    currentVisitedMask = currentVisitedMask | (1<<num);

                }
                //모든 숫자가 나왔는지 확인
                if (currentVisitedMask == allVisitedMask){
                    break;
                }
            }
            System.out.println("#" + i +" "+currentNumber);

        }
    }
}
