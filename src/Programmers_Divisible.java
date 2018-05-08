import java.util.ArrayList;
import java.util.Arrays;

public class Programmers_Divisible {

    public int[] divisible(int[] array, int divisor){

        ArrayList<Integer> retList = new ArrayList<Integer>();
        for(int i : array){
            if( i % divisor == 0){
                retList.add(i);
            }
        }

        int[] ret = new int[retList.size()];
        for(int i = 0; i< retList.size();i++){
          ret[i] = retList.get(i);
        }

        return ret;
    }

    public static void main(String[] agrs){
        Programmers_Divisible div = new Programmers_Divisible();
        int[] array = {5,9,7,10};
        System.out.println(Arrays.toString(div.divisible(array,5)));
    }

}
