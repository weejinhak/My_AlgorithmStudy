package Practice;

import java.io.*;
import java.util.StringTokenizer;

public class Class_15552 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        int arr[] = new int[T];

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            arr[i] = A + B;
        }

        for (int result : arr) {
            bw.write(String.valueOf(result));
            bw.newLine();
        }

        bw.flush();

    }

}
