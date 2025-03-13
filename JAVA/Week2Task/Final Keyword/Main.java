public class Main {
    public static void main(String[] args) {

        FinalClass obj1 = new FinalClass();
        System.out.println("Final Variable: " + obj1.fvar);

        //obj1.fvar = 200; // Uncommenting this will cause an error

        obj1.fmethod();

        NormalClass norm1 = new NormalClass();
        norm1.show();
    }
}
