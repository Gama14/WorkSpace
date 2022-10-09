/* Ejercicio que pasa un String a Char y si la palabra es par devuelve las dos letras del medio,
 en caso de ser impar solo devuelve una. Devuelve un String conformado por esas letras

 */
public class MiddleLetters {

    public static void main (String[]args){

        System.out.println(middleLetter("margaritas"));
        System.out.println(middleLetter("cat"));
        System.out.println(middleLetter("mimic"));



    }
    public static String middleLetter (String word){
        char[] wordLetters = word.toCharArray();
        int size = wordLetters.length;
        String newWord;

        if (size % 2 == 0) {
            int firstLetter = (size / 2)-1;
            String letter1 = String.valueOf(wordLetters[firstLetter]);
            String letter2 = String.valueOf(wordLetters[firstLetter+1]);
            newWord = letter1 + letter2;

        } else {
            newWord = String.valueOf(wordLetters[size / 2 ]);
        }
        return newWord;
    }
}
