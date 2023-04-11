package DataTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleDateFromatTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        extracted();
        SimpleDateFormat forMat = new SimpleDateFormat("yyyy-MM-dd");
        String birthday = input.nextLine();
        try {
            Date date = forMat.parse(birthday);
            SimpleDateFormat newDate = new SimpleDateFormat("yyyy年MM月dd日");
            String newBirthday = newDate.format(date);
            System.out.println(newBirthday);
        } catch (Exception e) {
            System.out.println("转换失败!");
        }
    }

    private static void extracted() {
        SimpleDateFormat forMat = new SimpleDateFormat("yyyy年MM月dd日 kk:mm:ss");
        String str = "2023年04月10日 09:10:20";
        try {
            Date date = forMat.parse(str);
            System.out.println(date);
        }catch (Exception e) {
            System.out.println("转换失败!");
        }
    }
}
