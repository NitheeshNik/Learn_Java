package java_practice;

public class StringBuff {
    public static void main(String a[]) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.capacity()); // Capacity of the String buffer
        System.out.println(sb.length());
        sb.append(" World");
        System.out.println(sb);

        sb.insert(4, "L");
        sb.replace(0, 4, "earths");
        System.out.println(sb);
        sb.delete(2, 6);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

    }

}
