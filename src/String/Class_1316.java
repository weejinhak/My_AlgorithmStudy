package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class_1316 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            boolean[] flag = new boolean[26];//초기값 false
            String str = br.readLine();

            //문자의 첫번째
            char ch = str.charAt(0);
            //문자의 첫번째 아스키코드 인덱스에 true 값 주기
            flag[(int) ch - 97] = true;

            //입력된 String의 길이만큼 돌면서 검사시작
            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j) == ch) { //같은 것이 한번 나왔다.
                    flag[(int) ch - 97] = true;
                } else {// 첫번째랑 다르지만
                    if (flag[(int) str.charAt(j) - 97]) {//true이면 예전에 한번 나왔다는 뜻
                        count++;
                        break;
                    } else {//예전에 문자가 안나왔다면 그자리에 true 추가 후 한번 나왔다는 것을 표시
                        flag[(int) str.charAt(j) - 97] = true;
                        ch = str.charAt(j);
                    }
                }
            }
        }
        //전체 개수에서 break 횟수를 빼면 그룹단어들이 나온다.
        System.out.println(N-count);
    }
}
