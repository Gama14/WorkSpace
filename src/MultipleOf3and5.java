import java.net.StandardSocketOptions;
/*
Dado un número entero encuentra los multiples de 3 i 5 de ese numero y los suma. Sin contar el volor del número
 */
public class MultipleOf3and5 {
    public static void main(String[] args) {

        System.out.println(sumOfMultiples(10));
    }
    public static int sumOfMultiples (int number){
       //primero crea lista con numeros consecutivos del 1 al valor del parametro
        int[] numbers = new int[number];
        int size= numbers.length;
        for(int i =0; i<size;i++){
            numbers[i]= i;
        }
        //verifica los valores que son multiples de 3 ó de 5 y los suma a un total
        int total = 0;
        for (int j = 0; j < size; j++) {
            if ((numbers[j] % 3 == 0) || (numbers[j] % 5 == 0)) {
                total += numbers[j];
            }
        }
        return total;
    }
}
