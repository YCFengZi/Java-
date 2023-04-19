package IO.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File("F:\\Java´úÂë\\Classroom\\src\\IO\\test\\cs.txt"));
        byte[] buff = new byte[24];
        int len = inputStream.read(buff);
        while ((len = inputStream.read(buff)) != -1) {
            System.out.println("len = " + len);
            System.out.println(Arrays.toString(buff));
        }
        inputStream.close();
    }
}