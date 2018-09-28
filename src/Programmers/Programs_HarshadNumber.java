package Programmers;

public class Programs_HarshadNumber {


    public static void main(String[] args){
        Programs_HarshadNumber sn = new Programs_HarshadNumber();
        System.out.println(sn.harshard(10));
    }

    private boolean harshard(int num) {
        String str = String.valueOf(num);
        char[] ch = str.toCharArray();
        int sum = 0;

        for(int i = 0; i < ch.length; i++){
            sum += Integer.parseInt(String.valueOf(ch[i]));
        }
        if(num%sum==0){
            return true;
        }
        return false;
    }

}
