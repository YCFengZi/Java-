package IO.Reader;

import java.io.*;

public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader streamReader = new InputStreamReader(new FileInputStream("F:\\Java����\\Classroom\\src\\IO\\test/����ʦ���ռǱ�.txt"));
        OutputStreamWriter streamWriter = new OutputStreamWriter(new FileOutputStream("F:\\Java����\\Classroom\\src\\IO\\test/����ʦ���ռǱ�.txt", true));
        String str = "\n������ѧϰ��Writer";
        FileReader reader = new FileReader("F:\\Java����\\Classroom\\src\\IO\\test/����ʦ���ռǱ�.txt");//���뷽����
        FileWriter writer = new FileWriter("F:\\Java����\\Classroom\\src\\IO\\test/����ʦ���ռǱ�.txt", true);//���������
        writer.write("\n����һ���򵥵Ĳ���");
        writer.flush();
        streamWriter.write(str);
        streamWriter.flush();
        int read = -1;
        char[] buff = new char[1024];//���ļ������ݺ󱣴��ڱ��ص�λ��
        while ((read = streamReader.read(buff)) != -1) {
            System.out.println(new String(buff, 0, read));//�������һ
        }
        while ((read = reader.read(buff)) != -1) {
            System.out.println(new String(buff, 0, read));//���������
        }
        writer.close();
        streamReader.close();
        streamWriter.close();
    }
}
