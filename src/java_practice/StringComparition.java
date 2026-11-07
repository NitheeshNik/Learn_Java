public class StringComparition {
    public static void main(String[] args) {
        String s = new String("jini");
        String s1 = "jini";
        boolean c = s == s1;
        boolean c1 = s.equals(s1);
        System.out.println(c1);
        System.out.println(c);
    }
}