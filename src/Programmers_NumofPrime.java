public class Programmers_NumofPrime {

    int numberOfPrime(int n){
        Boolean isprime;
        int allcount = 0;
        for(int i = 2; i<= n; i++){
            isprime = true;
            for(int j = 2; j < i; j++){
                if(i%j==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime) allcount++;
        }
        return allcount;
    }

    public static void main(String[] args){
        Programmers_NumofPrime prime = new Programmers_NumofPrime();
        System.out.println(prime.numberOfPrime(5));
    }
}
