package Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class_5430 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testNumber = Integer.parseInt(br.readLine());
        String[] answerArr = new String[testNumber];

        for (int i = 0; i < testNumber; i++) {

            String p = br.readLine();
            char[] ch = p.toCharArray();
            int arrNumber = Integer.parseInt(br.readLine());

            String str = br.readLine();
            String[] newStr = str.substring(1, str.length() - 1).split(",");
            StringBuilder sb = new StringBuilder();

            for (String aNewStr : newStr) {
                sb.append(aNewStr);
            }
            int count = 0;
            for (char c : ch) {
                if (c == 'D') {
                    count++;
                }
            }
            if (count > arrNumber) {
                answerArr[i] = "error";
            } else {
                answerArr[i] = "[" + Ing(ch, sb) + "]";
            }
        }

        for (String s : answerArr) {
            System.out.println(s);
        }
    }

    private static String Ing(char[] ch, StringBuilder sb) {

        for (char c : ch) {
            if (c == 'R') {
                sb.reverse();
            } else if (c == 'D') {
                sb.delete(0, 1);
            }
        }

        String returnStr = sb.toString();
        char[] returnChr = returnStr.toCharArray();
        StringBuilder returnSb = new StringBuilder();

        for (int i = 0; i < sb.length(); i++) {
            returnSb.append(returnChr[i]).append(",");
        }

        returnStr = returnSb.substring(0, returnSb.length() - 1);

        return returnStr;
    }

}
