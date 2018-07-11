package String;

public class Ex_String_replace {

    public static void main(String[] args) {
        String s = "봉숭아 학당 ! 봉숭아 학당!";
        String s2;

        System.out.println("원본  :" + s);
        System.out.println();

        s2 = s.replace("숭아", "맹구");
        System.out.println("바꿈  " + s2);

        s2 = s.replaceFirst("숭아", "맹구");
        System.out.println("바꿈2  " + s2);

        s2 = s.replaceAll("숭아", "맹구");
        System.out.println("바꿈3  " + s2);


        String s1 = "My name is Wee. My name is lee. My name is Son";

        s1 = s1.replaceAll("\\s", "");
        System.out.println(s1);
    }

}
