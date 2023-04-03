import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String account = input.next();
        StringBuilder password = new StringBuilder(account).reverse();
        System.out.println("账号：" + account);
        System.out.println("密码：" + password);
    }
}