import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
Un String con numeros separados por " ", ponerlos en un array y ordenarlos de manera ascendente por peso.
Si el num es 100 el peso será 1 y si el num es 99 el peso será 18. por tanto 100 irá antes que 99.
 */

public class WeightOrder {
    public static void main (String[]args){

        String strng = 100+" "+99+" "+12+" "+75+" "+87+" "+15+" "+1001+ " "+ 31;

        String [] numeros = strng.split("\\s");
        ArrayList<Integer> listaNum= new ArrayList<Integer>();

        for (String s: numeros) {
            listaNum.add(Integer.parseInt(s));
        }

        //ordena segun la suma de los digitos de cada int de manera ascendente.
        Collections.sort(listaNum,new CustomComparator());

        System.out.println(strng);
        System.out.println(listaNum);
    }

    public static int sumOfDigits (int n){
        int weight = 0;
        while (n>0){
            weight += n % 10;
            n = Math.floorDiv(n , 10);
        }
        return weight;
    }
}
    class CustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer num1, Integer num2) {
        return Integer.compare(WeightOrder.sumOfDigits(num1), WeightOrder.sumOfDigits(num2)) ;
        }
    }