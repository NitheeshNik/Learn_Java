import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] m = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        System.out.println(m.length); // number of rows
        System.out.println(m[0].length); // number of columns in row 0
        System.out.println(m[1][2]); // row 1, column 2

        for (int r = 0; r < m.length; r++) {
            int rowsum = 0;
            for (int c = 0; c < m[r].length; c++) {
                System.out.println(m[r][c] + " ");
                rowsum += m[r][c];
            }
            System.out.println("| sum = " + rowsum);
        }
        System.out.println(Arrays.deepToString(m));
    }
}