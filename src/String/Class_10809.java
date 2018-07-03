package String;

import java.io.*;

public class Class_10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sInput = br.readLine();

        int[] alphabet = new int[26];

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }

        char[] in = sInput.toCharArray();

        for (int i = 0; i < in.length; i++) {
            int tmp = in[i] - 97;
            if (alphabet[tmp] == -1) {
                alphabet[tmp] = i;
            }
        }

        for(int i = 0 ; i< alphabet.length;i++){
            System.out.print(alphabet[i]+" ");
        }

    }

}
