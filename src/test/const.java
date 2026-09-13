class Const {
    int a;
    String b;

    void display() {
        System.out.println(a + ", " + b);
    }

    public static void main(String args[]) {

        Const obj = new Const();
        obj.display(); // default constructor assign a the a,b automatically.

    }

}
