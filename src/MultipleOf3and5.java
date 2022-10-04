import java.net.StandardSocketOptions;
/*
Dado un número entero encuentra los multiples de 3 i 5 de ese numero y los suma. Sin contar el volor del número
 */
public class MultipleOf3and5 {
    public static void main(String[] args) {
        int number = 10;

        int[] numbers = new int[number];
        for(int i =0; i<numbers.length;i++){
            numbers[i]= i+1;

        }
        int total = 0;
        for (int j = 0; j < numbers.length-1; j++) {
            if ((numbers[j] % 3 == 0) || (numbers[j] % 5 == 0)) {
                total += numbers[j];
            }
        }

        System.out.println(total);
    }
}
