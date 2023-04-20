package IO.Buffer;

import java.io.*;

public class BufferTest {
    public static void main(String[] args) throws IOException {
        File file = new File("F:\\Java代码\\Classroom\\src\\IO\\test");
        //字节流
        FileInputStream inputStream = new FileInputStream("F:\\Java代码\\Classroom\\src\\IO\\test\\CG_TS02.png");
        FileOutputStream outputStream = new FileOutputStream("F:\\Java代码\\Classroom\\src\\IO\\test\\img.png");
        //输入缓存流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        //输出缓存流
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        //拷贝
        long start = System.currentTimeMillis();
        byte[] buff = new byte[100];
        int len;
        while ((len = bufferedInputStream.read(buff)) != -1) {
            bufferedOutputStream.write(buff,0,len);
        }
        bufferedOutputStream.flush();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        //先关大的，在关小的
        bufferedInputStream.close();
        bufferedOutputStream.close();
        inputStream.close();
        outputStream.close();
    }
}

class MyfileNameFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        File file = new File(dir, name);
        if (file.isFile() && name.endsWith(".png")) {
            return true;
        }
        return false;
    }
}