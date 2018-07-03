import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class_1065 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int i;
        int k;
        int han = 0;

        int a[] = new int[3];

        for(i = 1; i <= n ; i++){
            if(0<i&&i<100){
                han = i;
            }else if(i == 1000){
                break;
            }else {
                k = 0;
                int t = i;
                while (t>0){
                    a[k] = t%10;
                    t /=10;
                    k++;
                }
                if(a[0] - a[1] == a[1]-a[2]){
                    han++;
                }
            }
        }
        System.out.println(han);

    }

}

