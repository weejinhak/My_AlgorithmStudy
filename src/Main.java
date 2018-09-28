import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            boolean[] flag = new boolean[26];
            String str = br.readLine();

            char ch = str.charAt(0);
            flag[(int) ch - 97] = true;

            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    flag[(int) ch - 97] = true;
                } else {
                    if (flag[(int) str.charAt(j) - 97]) {
                        count++;
                        break;
                    } else {
                        flag[(int) str.charAt(j) - 97] = true;
                        ch = str.charAt(j);
                    }
                }
            }
            System.out.println(N-count);
        }
    }

}
