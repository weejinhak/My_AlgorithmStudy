public class Programmers_Collatz {
    static int count = 0;

    public int collatz(int num) {
        count++;
        if(num%2==0){
            num/=2;
        }else{
            num= num*3+1;
        }
        if(num!=1){
            if(count==500){
                return -1;
            }
            collatz(num);
        }
        return count;
    }
}
