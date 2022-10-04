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
