package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고,
kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다.
둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며,
길이는 최대 100이다.

출력
첫째 줄에 그룹 단어의 개수를 출력한다.

*/

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
