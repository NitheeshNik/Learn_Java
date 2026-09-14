class FileReader {
    public static void main(String [] args){
        try {
            java.io.FileReader fr = new java.io.FileReader("/home/knith/Learn_Java/src/test/out.txt");
            int i;
            while ((i=fr.read())!=-1)
                System.out.println((char)i);
                fr.close();
        }catch (Exception e){
            System.out.println("success");
        }
}
}