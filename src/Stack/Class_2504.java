package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Class_2504 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        Stack<Character> s = new Stack<>();

        int ans = 0;
        int k = 0;
        int l = 0;
        int mul = 1;

        for (int i = 0; i < n.length(); i++) {
            char now = n.charAt(i);
            switch (now) {
                case '(':
                    ++k;
                    s.push(now);
                    mul *= 2;
                    if (i + 1 < n.length() && n.charAt(i + 1) == ')') {
                        ans += mul;
                    }
                    break;
                case '[':
                    ++l;
                    s.push(now);
                    mul *= 3;
                    if (i + 1 < n.length() && n.charAt(i + 1) == ']') {
                        ans += mul;
                    }
                    break;
                case ')':
                    --k;
                    s.pop();
                    mul /= 2;
                    break;
                case ']':
                    --l;
                    s.pop();
                    mul /= 3;
                    break;
            }
        }
        if (s.size() != 0 || l != 0 || k != 0) System.out.println(0);
        else System.out.println(ans);

    }
}
