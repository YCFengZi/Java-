package StringDemo;

import java.util.Random;

public class MathAndRandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("随机数");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d:%.1f\n",i+1,r.nextDouble(10.0,100.0));
        }
    }
}
