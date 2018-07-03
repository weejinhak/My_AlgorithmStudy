package Programmers;

import java.io.IOException;

public class Programmers_FindKim {

    public String findKim(String[] seoul) throws IOException {

       int x = 0;
       for(int i = 0; i< seoul.length;i++){
           if(seoul[i]=="Kim"){
               x = i;
           }
       }

        return "김서방은 "+ x + "에 있다";
    }

    public static void main(String[] args) throws IOException {
        Programmers_FindKim find = new Programmers_FindKim();
        String[] names ={"Queen","Tod","Kim"};
        System.out.println(find.findKim(names));
    }

}
