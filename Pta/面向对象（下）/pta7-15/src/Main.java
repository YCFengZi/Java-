public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        son.method();
    }
}
class Parent {
    Parent() {
        System.out.println("Parent's Constructor without parameter");
    }

    Parent(boolean b) {
        System.out.println("Parent's Constructor with a boolean parameter");
    }

    public void method() {
        System.out.println("Parent's method()");
    }
}

class Son extends Parent {
    //补全本类定义
    private static boolean b;
    public Son() {
        super(b);
        System.out.println("Son's Constructor without parameter");
    }
    public void method() {
        System.out.println("Son's method()");
        System.out.println("Parent's method()");
    }
}