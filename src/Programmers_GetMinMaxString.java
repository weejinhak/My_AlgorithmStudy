import com.sun.tools.corba.se.idl.InterfaceGen;

import java.util.Arrays;

public class Programmers_GetMinMaxString {

    public String getMinMaxString(String str){
        String[] sol = str.split(" ");
        int [] intArray = new int[sol.length];

        for(int i = 0 ; i< intArray.length ; i++){
            intArray[i] = Integer.parseInt((sol[i]));
        }
        Arrays.sort(intArray);

        return intArray[0]+" "+intArray[intArray.length-1];
    }

    public static void main(String[] args){
        String str = "1 2 3 4";
        Programmers_GetMinMaxString minMax = new Programmers_GetMinMaxString();
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }

}
