import java.io.*;

public class Main {
    public static void main(String[] args) {
        Employee.Serialization(111,"asd","sdf");
        Employee.Deserialization();

    }
}

class Employee implements Serializable {
    int Eno;
    String Ename;
    String Email;

    // Constructor
    Employee(int Eno, String Ename, String Email) {
        this.Eno = Eno;
        this.Ename = Ename;
        this.Email = Email;
    }

    static void Serialization(int Eno, String Ename, String Email) {
        try {
        // Creating the object
            Employee E1 = new Employee(Eno, Ename, Email);

        // Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(E1);
            out.flush();

        // Closing the stream
            out.close();
            fout.close();

            System.out.println("Serialization successful");
    } catch (Exception e) {
        System.out.println("Exception: " + e);
    }
}

    static void Deserialization() {
        try{
        //Creating stream to read the object
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
            Employee e=(Employee) in.readObject();
            //printing the data of the serialized object
            System.out.println(e.Eno+" "+e.Ename+" "+e.Email);
            //closing the stream
            in.close();
        }catch(Exception e){System.out.println(e);}
    }
}
