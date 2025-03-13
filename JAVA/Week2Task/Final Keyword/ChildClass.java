// A subclass that tries to override a final method (which is not allowed)
// Uncommenting the below code will cause a compilation error

class ChildClass extends NormalClass {
    // Trying to override final method will cause a compilation error
    //void show() {
         //System.out.println("Attempting to override a final method.");
    //}
    void simpleprint(){
        System.out.println("We cannot modify anything present in the FINAL Normal Class, so we just create a new method instead...");
    }
}
