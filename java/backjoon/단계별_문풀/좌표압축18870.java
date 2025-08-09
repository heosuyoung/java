package 단계별_문풀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 좌표압축18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int [] origin = new int[N];
        int [] sorted = new int [N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N;i++){
            int val = Integer.parseInt(st.nextToken());
            origin[i]= val;
            sorted[i]= val; //한개의 원래 인덱스랑 비교해야하므로 2개 만듬

        }
        Arrays.sort(sorted);

        Map<Integer,Integer> coordinateMap = new HashMap<>();
        int rank =0; //압축된 좌표는0부터

        for (int coord : sorted){
            //만약 현재 좌표값이 맵에 없다면(처음 등장하는 유일값이라면
            if (!coordinateMap.containsKey(coord)){
                coordinateMap.put(coord,rank);//맵에 값과 현재 순위를 저장
                rank++; //다음 유일 값 위해 값증가
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int coord: origin){ //원본 배열 순회하며 각 원본 좌표에 해당하는 압축 좌표 찾아서
            sb.append(coordinateMap.get(coord)).append(" "); //추가
        }
        System.out.println(sb.toString().trim()); //마지막 끝에 공백제거 위해서
    }
}
