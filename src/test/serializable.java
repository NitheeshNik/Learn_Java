import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class emp implements Serializable {

    int eid;
    String ename;

    emp(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }
}

class ser_ex {

    public static void main(String args[]) {
        try {
            emp obj = new emp(1, "Nik");
            FileOutputStream fout = new FileOutputStream("/home/knith/Learn_Java/src/test/stream.txt");
            ObjectOutputStream a = new ObjectOutputStream(fout);
            a.writeObject(obj);
            a.flush();
            a.close();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}