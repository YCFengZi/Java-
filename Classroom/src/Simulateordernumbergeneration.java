import java.util.Arrays;
import java.util.Scanner;

public class Simulateordernumbergeneration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String[] arr = str.split(",");
        String str2 = "";
        for (int i = 0; i < arr.length; i++) {
            str2 += arr[i];
        }
        System.out.printf("[%s]",str2);
    }
}