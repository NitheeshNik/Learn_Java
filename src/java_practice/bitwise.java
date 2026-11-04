public class bitwise {
    public static void main(String[] args) {
        System.out.println(5 & 3); // AND: 0001
        System.out.println(5 | 3); // OR: 0111
        System.out.println(5 ^ 3); // XOR: 0110 (1 where bits differ)
        System.out.println(~5); // NOT: flips every bit
        System.out.println(5 << 1); // shift left: ×2
        System.out.println(5 << 2); // shift left twice: ×4
        System.out.println(20 >> 2); // shift right twice: ÷4
    }

}
