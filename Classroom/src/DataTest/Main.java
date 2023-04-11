package DataTest;

import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        Random r = new Random();
        Date date1 = new Date();
        Date date2 = new Date(0l);
        Date date3 = new Date(24*60*60*1000l);
        Date date4 = new Date(365*24*60*60*1000l);
        Date date5 = new Date(r.nextInt());
        Date date6 = new Date(r.nextInt());
        if (date5.getTime() > date6.getTime()) {
            System.out.println("DATE5 BIG");
        } else if(date5.getTime() < date6.getTime()) {
            System.out.println("DATE6 BIG");
        } else {
            System.out.println("==");
        }
        System.out.printf("%tc\n%tc\n%tc\n%tc\n%tc\n%tc",date1,date2,date3,date4,date5,date6);
    }
}