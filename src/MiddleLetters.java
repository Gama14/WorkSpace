/* Ejercicio que pasa un String a Char y si la palabra es par devuelve las dos letras del medio,
 en caso de ser impar solo devuelve una. Devuelve un String conformado por esas letras

 */
public class MiddleLetters {

    public static void main (String[]args){
            String prueba ="margaritas";

            char[] word = prueba.toCharArray();
            int size = word.length;
            String newWord;

            if (size % 2 == 0) {
                int firstLetter = size / 2;
                int secondLetter = firstLetter ;
                String letter1 = String.valueOf(word[firstLetter-1]);
                String letter2 = String.valueOf(word[secondLetter]);
                newWord = letter1 + letter2;

            } else {
                newWord = String.valueOf(word[size / 2 ]);
            }


            System.out.println(newWord);



    }

}
