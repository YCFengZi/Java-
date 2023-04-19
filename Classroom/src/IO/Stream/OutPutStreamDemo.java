package IO.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutStreamDemo {
    public static void main(String[] args) throws IOException {
        test1();
        FileInputStream inputStream = new FileInputStream(new File("F:\\Java代码\\Classroom\\src\\IO\\test\\cs.txt"));
        FileOutputStream outputStream = new FileOutputStream(new File("F:\\Java代码\\Classroom\\src\\IO\\test\\cs2.txt"),true);
        byte[] buff = new byte[10];
        int len = -1;
        while ((len = inputStream.read(buff)) != -1) {
            outputStream.write(buff);
        }
        inputStream.close();
        outputStream.close();
    }

    private static void test1() throws IOException {
        FileOutputStream outputStream = new FileOutputStream(new File("F:\\Java代码\\Classroom\\src\\IO\\test\\cs.txt"),true);
        String str = "伊吹风子";
        byte[] bytes = str.getBytes();//将字符串转成字节数组
        outputStream.write(bytes);
        outputStream.close();
    }
}
