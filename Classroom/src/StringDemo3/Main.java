package StringDemo3;

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
    }
}