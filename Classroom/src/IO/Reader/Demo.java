package IO.Reader;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("F:\\Java´úÂë\\Classroom\\src\\IO\\test/¹âÃ¢-107306277-0.png"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("F:\\Java´úÂë\\Classroom\\src\\IO\\test/img.png"));
        long start = System.currentTimeMillis();
        int len;
        byte[] buff = new byte[1024];
        while ((len = bufferedInputStream.read(buff)) != -1) {
            bufferedOutputStream.write(buff,0,len);
        }
        bufferedOutputStream.flush();
        bufferedInputStream.close();
        bufferedOutputStream.close();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
