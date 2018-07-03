import java.io.*;
import java.util.Arrays;

class Class_Line {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] s = br.readLine().split( " ");

        if(Integer.parseInt(input)!=s.length){
            return ;
        }

        int[] sArr = new int[s.length];

        for(String i : s){
            sArr[Integer.parseInt(i)-1] = Integer.parseInt(i);
        }

        Arrays.sort(sArr);

        System.out.println(sArr[sArr.length-1]);

//        for (int i = 0; i < input.length; i++) {
//            System.out.println(input[i]);
//        }

        System.out.println("Hello Goorm! Your input is " + input);

    }

}
