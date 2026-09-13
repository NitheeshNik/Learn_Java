class exec {
    public static void main(String[] var0) {
        try {
            int var1 = 10 / 0;
            System.out.println(var1);
        } catch (Exception var5) {
            System.out.println(var5);
        } finally {
            System.out.println("Finally block is always executed");
        }

        System.out.println("Rest the code");
    }
}
