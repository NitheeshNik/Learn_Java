package java_practice;

import java.lang.StringBuilder;

public class Stringbulid {
    public static void main(String[] a) {
        StringBuilder sb = new StringBuilder("Nitheesh");
        sb.append(" World");
        sb.insert(9, "jini");
        sb.replace(9, 13, "love");
        sb.delete(9, 13);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        String finalResult = sb.toString(); // covert into normal string
        System.out.println(finalResult);

    }

}
