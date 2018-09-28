import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());

        String str = "";
        String[] bArr = new String[t];

        for(int i = 0 ; i < t ; i++){
            st = new StringTokenizer(br.readLine());
            int rnum = Integer.parseInt(st.nextToken());
            String inputString = st.nextToken();

            for(int j = 0 ; j < inputString.length();j++){
                for(int k = 0 ; k < rnum ; k++){
                    str += inputString.charAt(j);
                }
            }
            bArr[i] = str;
            str = "";
        }
        for(int i = 0 ; i< t; i++){
            System.out.println(bArr[i]);
        }
    }
}