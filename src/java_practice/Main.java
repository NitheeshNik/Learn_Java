public class Main {
    public static void main(String[] args) {
        // Data
        String line = "==============================";
        String title = "STUDENT CARD";
        String name = "Arun Kumar";
        int age = 19;
        String course = "B.Sc Computer Science";
        double fees = 45000.50;
        // Header
        System.out.println(line);
        System.out.println("        " + title);
        System.out.println(line);

        // Student details
        System.out.printf("Name   : %s%n", name); // well i use %n for next because printf will print output same line
        System.out.printf("Age    : %d%n", age);
        System.out.printf("Course : %s%n", course);
        System.out.printf("Fees   : Rs. %.2f%n", fees); // .2 after dot two decimal values

        // Footer
        System.out.println(line);
        System.out.println("Motto:\t\"Learn Daily\"");

    }

}
