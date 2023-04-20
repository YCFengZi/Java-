package IO.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBuffTest {
    public static void main(String[] args) throws IOException {
//        extracted(); //边读边写，速度慢
        extracted1(); //一次性读入，速度快
    }

    private static void extracted1() throws IOException {
        FileInputStream inputStream = new FileInputStream(new File("F:\\Java代码\\Classroom\\src\\IO\\test\\CG_TS02.png"));
        FileOutputStream outputStream = new FileOutputStream(new File("F:\\Java代码\\Classroom\\src\\IO\\test\\img.png"));
        //先读，判断是否结束，如果为-1，结束，否则继续读
        long start = System.currentTimeMillis();//当前时间
        byte[] buff = new byte[300];
        int len = -1;//读得实际长度
        //一次性读入
        do {
            len = inputStream.read(buff);
            if (len >= 0) {//读出有效内容才写入b
                outputStream.write(buff,0,len);
            }
        } while (len != -1);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        inputStream.close();
        outputStream.close();
    }

    private static void extracted() throws IOException {
        FileInputStream inputStream = new FileInputStream(new File("F:\\Java代码\\Classroom\\src\\IO\\test\\CG_TS02.png"));
        FileOutputStream outputStream = new FileOutputStream(new File("F:\\Java代码\\Classroom\\src\\IO\\test\\img.png"));
        long start = System.currentTimeMillis();//当前时间
        int read;
        do {
            //边读边写
            read = inputStream.read();
            outputStream.write(read);
        } while (read != -1);
        long end = System.currentTimeMillis();//结束得时候
        System.out.println(end-start);//计时
        inputStream.close();
        outputStream.close();
    }
}
