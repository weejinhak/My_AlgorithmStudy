package Practice;

import java.util.*;
import java.io.*;
public class Class_1715{


    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int n = Integer.parseInt(br.readLine());
        int a , b;
        int answer = 0;

        PriorityQueue que = new PriorityQueue();

        for(int i = 0 ; i < n ; i++){
            int q = Integer.parseInt(br.readLine());
            que.add(q);
        }

        while (que.size() > 1){
            a = (int) que.poll();
            que.remove(1);
            b = (int) que.poll();
            que.remove(1);
            que.add(a+b);
            answer += a+b;
        }

        System.out.println(answer);
    }

}