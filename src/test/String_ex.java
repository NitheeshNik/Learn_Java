class String_ex {

    public static void main(String[] args) {
        String s = "JINI";
        String b = "NIK";
        System.out.println(s.toUpperCase());// all upper
        System.out.println(s.toLowerCase());// all lower
        System.out.println(s);
        System.out.println(s.concat(" " + b));// concadination strings
        // Sub String
        System.out.println(s.substring(2));// substring
        System.out.println(s.replace("chello", "JII"));
        System.out.println(s.length());
        System.out.println(s.charAt(3)); // only print spacific character

        // Convert any datatype into string
        String h = "1, nik,jini,2021";
        h.toString();
        String d[] = h.split(",");
        System.out.println(d[3]);// array split
    }
}