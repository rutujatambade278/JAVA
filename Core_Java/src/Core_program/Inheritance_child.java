package Core_program;

public class Inheritance_child extends Inheritance_Example {
    
//    public void m1() {
//        System.out.println("child m1()");
//    }

    public static void main(String[] args) {
        Inheritance_Example parent = new Inheritance_child();
        parent.m1();
    }
}
