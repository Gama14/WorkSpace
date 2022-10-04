import java.util.Arrays;
/*
Un String con numeros separados por "", ponerlos en un array y ordenarlos de manera ascendente por peso.
Si el num es 100 el peso serà 1 y si el num es 99 el peso serà 18. por tanto 100 irá antes que 99.
 */

public class WeightOrder {
    public static void main (String[]args){

        String strng = 100+""+99+""+12+""+75+""+87+""+15;
        String[] numeros = strng.split("");
        int[] weight = new int[numeros.length];
        for (int i=0; i<numeros.length;i++){
            weight[i]= Integer.parseInt(numeros[i]);
        }
       System.out.println(Arrays.toString(weight));

//incompleto
    }
}