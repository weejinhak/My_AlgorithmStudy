package Programmers;

public class Programmers_Collatz {
    static int count = 0;

    public int collatz(int num) {
        System.out.print(num +" ");

        if(count==500) return -1;//500번 반복시 -1 반환

        if(num == 1) return count;//num이 1이 되면 count 반환

        else if(num%2==0){ // 짝수면 2로 나눈값 다시 재귀
            count++;
            collatz(num/2);
        }
        else if(num%2==1){ // 홀수면 3곱하고 1더해서 다시 재귀
            count++;
            collatz((num*3)+1);
        }
        return count;
    }
}
