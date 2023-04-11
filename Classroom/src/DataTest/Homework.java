package DataTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Homework {
    public static void main(String[] args) {
        try {
            SimpleDateFormat forMat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            Date s1 = forMat.parse("2023年11月11日 0:01:00");
            Date s2 = forMat.parse("2023年11月11日 0:11:0");
            Date str = forMat.parse("2023年11月11日 0:0:0");
            Date end = forMat.parse("2023年11月11日 0:10:0");
            if (s1.getTime() > str.getTime() && s1.getTime() < end.getTime()) {
                System.out.println("小贾赶上了");
            } else {
                System.out.println("小贾没赶上");
            }
            if (s2.getTime() > str.getTime() && s2.getTime() < end.getTime()) {
                System.out.println("小皮赶上了");
            } else {
                System.out.println("小皮没赶上");
            }
        } catch (Exception e) {
            System.out.println("转换错误!");
        }
    }
}
