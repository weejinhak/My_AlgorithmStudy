package String;

public class Ex_String_Convert {

    public static void main(String[] args) {

        String s = "12345";
        int i = 12345;

        //문자열을 정수로 변환
        int int1 = Integer.parseInt(s);//s가 숫자로 되어있어야함.

        //정수형을 문자열로 변환
        String str = Integer.toString(i);
        String str1 = String.valueOf(i);

        //문자열에서 다른 숫자로 변환
        float f = Float.parseFloat(s);
        double d = Double.parseDouble(s);
        byte b = Byte.parseByte(s);
        long l = Long.parseLong(s);
        short sh = Short.parseShort(s);

        //다른 숫자형태에서 문자열로 변환
        String str3 = String.valueOf(i/*여러형태들*/);

    }

}
