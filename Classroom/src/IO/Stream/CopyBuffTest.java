package IO.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBuffTest {
    public static void main(String[] args) throws IOException {
//        extracted(); //�߶���д���ٶ���
        extracted1(); //һ���Զ��룬�ٶȿ�
    }

    private static void extracted1() throws IOException {
        FileInputStream inputStream = new FileInputStream(new File("F:\\Java����\\Classroom\\src\\IO\\test\\CG_TS02.png"));
        FileOutputStream outputStream = new FileOutputStream(new File("F:\\Java����\\Classroom\\src\\IO\\test\\img.png"));
        //�ȶ����ж��Ƿ���������Ϊ-1�����������������
        long start = System.currentTimeMillis();//��ǰʱ��
        byte[] buff = new byte[300];
        int len = -1;//����ʵ�ʳ���
        //һ���Զ���
        do {
            len = inputStream.read(buff);
            if (len >= 0) {//������Ч���ݲ�д��b
                outputStream.write(buff,0,len);
            }
        } while (len != -1);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        inputStream.close();
        outputStream.close();
    }

    private static void extracted() throws IOException {
        FileInputStream inputStream = new FileInputStream(new File("F:\\Java����\\Classroom\\src\\IO\\test\\CG_TS02.png"));
        FileOutputStream outputStream = new FileOutputStream(new File("F:\\Java����\\Classroom\\src\\IO\\test\\img.png"));
        long start = System.currentTimeMillis();//��ǰʱ��
        int read;
        do {
            //�߶���д
            read = inputStream.read();
            outputStream.write(read);
        } while (read != -1);
        long end = System.currentTimeMillis();//������ʱ��
        System.out.println(end-start);//��ʱ
        inputStream.close();
        outputStream.close();
    }
}
