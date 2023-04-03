import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Add add = new Add();
        Sub sub = new Sub();
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.printf("%d\n%d",add.computer(a,b),sub.computer(a,b));
    }
}

interface ICompute {
    int computer(int n, int m);
}

class Add implements ICompute {
    @Override
    public int computer(int n, int m) {
        return n + m;
    }
}

class Sub implements ICompute {
    @Override
    public int computer(int n, int m) {
        return n - m;
    }
}