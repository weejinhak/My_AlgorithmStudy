package Programmers;

public class Programmers_JadenCase {

    public static void main(String[] args){

        String s = "3people unFollowed me";

        String[] split = s.split(" ");
        StringBuilder sb = new StringBuilder();
        String check =  "";
        String answer = "";

        for(String str :split){
            check = ((str.substring(0, 1).toUpperCase() + str.substring(1, str.length()) +" "));
            sb.append(check);
        }
        answer = sb.toString().substring(0,sb.length()-1);


        System.out.println(answer);

    }

}
