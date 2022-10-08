import java.util.Stack;

/*

 */
public class ValidBraces {
    public static void main(String[] args) {
        String str1 = "[]";
        String str2 = "[{]}([{()}])";
        String str3 = "[{}]()[{()}]";

        System.out.println(isCorrectClossed(str1));
        System.out.println(isCorrectClossed(str2));
        System.out.println(isCorrectClossed(str3));
    }

    public static boolean isCorrectClossed(String str) {
        System.out.print(str+" - ");
        Stack queue = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch(c) {
                case '[':
                    queue.push(c);
                    break;
                case ']':
                    if ((char)queue.peek() == '[') {
                        queue.pop();
                    } else {
                        return false;
                    }
                    break;

                case '(':
                    queue.push(c);
                    break;
                case ')':
                    if ((char)queue.peek() == '(') {
                        queue.pop();
                    } else {
                        return false;
                    }
                    break;

                case '{':
                    queue.push(c);
                    break;
                case '}':
                    if ((char)queue.peek() == '{') {
                        queue.pop();
                    } else {
                        return false;
                    }
                    break;

                default:
                    //Do nothing its OK
                    break;
            }

        }
        return queue.empty();
    }

}
