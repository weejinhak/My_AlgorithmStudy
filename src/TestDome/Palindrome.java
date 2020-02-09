package TestDome;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindron("Deleveled"));
    }

    private static boolean isPalindron(String str) {

        int strLength = str.length();
        for (int i = 0; i < strLength; i++) {
            if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(strLength - i - 1))) {
                return false;
            }
        }

        return true;
    }
}
