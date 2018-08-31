package Programmers;

class Programmers_long_palindrome {

    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        int temp = 0;

        for (int i = 0; i < len - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                temp = 0;
                for (int j = 0; j < len; j++) {
                    char left = s.charAt(i + 1 - j + i);
                    char right = s.charAt(j);
                    if (left == right) {
                        answer += 2;
                    } else break;
                }
                if (answer < temp) {
                    answer = temp;
                }
            }
        }

        for (int i = 0; i < len - 1; i++) {
            temp = 1;
            for (int j = i - 1; j >= 0; j--) {
                char left = s.charAt(j);
                char right = s.charAt(i + i - j);
                if (left == right) {
                    answer += 2;
                } else break;
            }
            if (answer < temp) {
                answer = temp;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Programmers_long_palindrome p = new Programmers_long_palindrome();
        System.out.println(p.solution("asdf"));
    }
}