import java.io.*;

class Student implements Serializable {
    int rno;
    String name;

    // Constructor
    Student(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }
}

class SerializeDemo {
    public static void main(String[] args) {
        try {
            // Creating the object
            Student s1 = new Student(211, "Ravi");

            // Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();

            // Closing the stream
            out.close();
            fout.close();

            System.out.println("Serialization successful");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
