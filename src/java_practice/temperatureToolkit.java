public class temperatureToolkit {
    public static void main(String[] args) {
        int a = 100000;
        int b = 100000;

        long wrong = a * b; // multiplied as int FIRST, overflows, then widened
        long right = (long) a * b; // a becomes long first, so the multiply is long

        System.out.println(wrong);
        System.out.println(right);
    }
}