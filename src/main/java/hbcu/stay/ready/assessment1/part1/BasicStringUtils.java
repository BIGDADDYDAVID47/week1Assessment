package hbcu.stay.ready.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        return null;
    }
    String name; BufferedReader br = new InputStreamReader( System.in);

    String s1 = name.charAt(0).toUppercase();
return (s1 + name.substring(1));
    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String input = "she sells sea shells";

        StringBuilder input1 = new
                input1.append(input);

        input1 = input1.reverse();

        return (input1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        char[] in = input.toCharArray();
        int begin = 0;
        int end = in.length-1;
        char temp;
        while (end>begin) {
            temp = in[begin]{
                    temp = in[begin];
                    in[begin]=in[end];
                    in[end] = temp;
                    end--;
                    begin++;

            }
        return new String(in);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return null;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return null;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        return null;
    }

}
