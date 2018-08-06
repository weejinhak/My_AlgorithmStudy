package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Class_9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());


        String[] answerArr = new String[input];

        for (int i = 0; i < input; i++) {

            String s = br.readLine();
            Stack<Character> stack = new Stack<>();
            int ctn = 0;

            for (int j = 0; j < s.length(); j++) {
                char trimS = s.charAt(j);
                if (trimS == '(') {
                    ctn++;
                    stack.push(trimS);
                } else if (trimS == ')') {
                    ctn--;
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        ctn--;
                    }
                    if(ctn<0){
                        answerArr[i] = "NO";
                        break;
                    }
                }
            }

            if (ctn == 0) {
                answerArr[i] = "YES";
            } else {
                answerArr[i] = "NO";
            }

        }

        for (String s : answerArr) {
            System.out.println(s);
        }
    }

}
