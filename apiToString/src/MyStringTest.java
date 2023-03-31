import java.util.Scanner;

public class MyStringTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String str = s.toUpperCase();
        System.out.println(str);//转化为大写输出
        //判断有无name字符串
        int index = s.indexOf("name");
        if (index != -1) {
            System.out.println(s.indexOf("name"));
        } else {
            System.out.println("没有name");
        }
        //倒序输出
        StringBuilder strings = new StringBuilder(str).reverse();
        System.out.println(strings.toString());
    }
}