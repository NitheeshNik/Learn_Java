import java.util.Scanner;

public class numberToolkit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSeconds = 3661;
        int hour = totalSeconds % 60;
        System.out.println(hour);
    }
}