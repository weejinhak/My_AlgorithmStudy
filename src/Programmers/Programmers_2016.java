package Programmers;

public class Programmers_2016 {

    public String solution(int a, int b) {
        String answer = "";

        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 1; i < a; i++) {
            b += date[i - 1];
            System.out.println(b);
        }
        switch (b%7){
            case 3: answer = "SUN";break;
            case 4: answer = "MON";break;
            case 5: answer = "TUE";break;
            case 6: answer = "WED";break;
            case 0: answer = "THU";break;
            case 1: answer = "FRI";break;
            case 2: answer = "SAT";break;
        }
        return answer;
    }

    public static void main(String[] args) {

        Programmers_2016 test = new Programmers_2016();
        int a = 5, b = 24;
        System.out.println(test.solution(a, b));
        
    }

}
