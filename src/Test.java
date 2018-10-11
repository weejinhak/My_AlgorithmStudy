public class Test {
    public static void main(String[] args) {
        String[] str = new String[10];
        for (int i = 0; i < 10; i++) {
            str[i] = String.valueOf(i);
        }

        for(String s :str){
            System.out.print(s.toString());
        }
    }
}
