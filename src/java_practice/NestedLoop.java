public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println();

        // 3x3 grid
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

        outer: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i * j == 6) {
                    System.out.println("found" + i + "," + j);
                    break outer;
                }
            }
        }
    }
}