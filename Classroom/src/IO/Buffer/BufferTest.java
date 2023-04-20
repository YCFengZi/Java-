package IO.Buffer;

import java.io.*;

public class BufferTest {
    public static void main(String[] args) throws IOException {
        File file = new File("F:\\Java����\\Classroom\\src\\IO\\test");
        //�ֽ���
        FileInputStream inputStream = new FileInputStream("F:\\Java����\\Classroom\\src\\IO\\test\\CG_TS02.png");
        FileOutputStream outputStream = new FileOutputStream("F:\\Java����\\Classroom\\src\\IO\\test\\img.png");
        //���뻺����
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        //���������
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        //����
        long start = System.currentTimeMillis();
        byte[] buff = new byte[100];
        int len;
        while ((len = bufferedInputStream.read(buff)) != -1) {
            bufferedOutputStream.write(buff,0,len);
        }
        bufferedOutputStream.flush();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        //�ȹش�ģ��ڹ�С��
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