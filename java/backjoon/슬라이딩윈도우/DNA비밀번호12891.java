package 슬라이딩윈도우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DNA비밀번호12891 {
    static int myArr[];
    static int checkArr[];
    static int checkSecret;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int cnt =0; //정답 개수
        checkArr= new int[4]; // 3번째 줄에 들어오는 부분문자열에 포함돼야할 최소 개수 'A','C','G','T' 몇개가 들어와야 하는지
        myArr= new int[4]; // 현재 내가 포함하고있는 'A','C','G','T' 개수
        //chekArr과 myArr을 비교
        char DNAArr[]=new char[S]; //2번째줄에 들어오는 DNA문자열
        checkSecret =0; //지금 내 myArr과 checkArr의 일치 정도 이게 4가되면 cnt++해주면되는거임!

        DNAArr = br.readLine().toCharArray();
        st=new StringTokenizer(br.readLine());
        for (int i=0; i<4;i++){
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i]==0){
                checkSecret++; //0이라면 1자리는 이미 만족한거나 마찬가지이므로 올림
            }
        }
        for (int i=0; i<P; i++){
            Add(DNAArr[i]); //ADD함수를 만들어서 현재 상태 배열에 넣을거임 S배열의 P개수 만큼 그러면 P부분 문자열이 완성됨
        }
        if (checkSecret==4) cnt++; //처음 문자열 받았을때 조건 만족하는지

        //슬라이딩 윈도우 이제 슬라이딩 윈도우 하면서 조건만족하는지 확인
        for(int i=P; i<S; i++){ //i는 맨오른쪽 j는 맨왼쪽으로 지정되는거임
            int j=i-P;         //한칸씩 이동하며 윈도우를 움직이는거!
            Add(DNAArr[i]);//한칸 움직이면 i는 추가하고 j는 뺴줘야함
            Remove(DNAArr[j]);
            if (checkSecret == 4 ) cnt++;
        }
        System.out.println(cnt);
    }

    private static void Remove(char c) {
        switch (c){
            case 'A':
                if (myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }

    private static void Add(char c) {
        switch (c){
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) checkSecret++;
                break;
        }
    }

}
