
import java.io.FileWriter;

class File_writer {
    public static void main(String[] args) {
        try {

            FileWriter obj = new FileWriter("/home/knith/Learn_Java/src/test/out.txt"); // create a object and set a
                                                                                        // path and file
            obj.write("Hi JINI"); // what you want to print in that file out.txt
            obj.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("success");

    }

}