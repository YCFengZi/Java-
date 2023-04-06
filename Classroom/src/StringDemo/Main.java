package StringDemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        s = s.trim();
        String year = s.substring(6,10);
        String month = s.substring(10,12);
        String day = s.substring(12,14);
        System.out.println(year + "-" + month + "-" + day);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("510321200401037598");
        stringBuilder.append("114514");
        stringBuilder.insert(18,"2210305626");
        System.out.println(stringBuilder.toString());
        int index = stringBuilder.indexOf("2210305626");
        System.out.println(index);
    }
}