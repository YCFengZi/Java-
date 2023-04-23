package IO.Reader;

import java.io.*;

public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader streamReader = new InputStreamReader(new FileInputStream("F:\\Java代码\\Classroom\\src\\IO\\test/马老师的日记本.txt"));
        OutputStreamWriter streamWriter = new OutputStreamWriter(new FileOutputStream("F:\\Java代码\\Classroom\\src\\IO\\test/马老师的日记本.txt", true));
        String str = "\n今天我学习了Writer";
        FileReader reader = new FileReader("F:\\Java代码\\Classroom\\src\\IO\\test/马老师的日记本.txt");//输入方法二
        FileWriter writer = new FileWriter("F:\\Java代码\\Classroom\\src\\IO\\test/马老师的日记本.txt", true);//输出方法二
        writer.write("\n这是一个简单的测试");
        writer.flush();
        streamWriter.write(str);
        streamWriter.flush();
        int read = -1;
        char[] buff = new char[1024];//从文件中数据后保存于本地的位置
        while ((read = streamReader.read(buff)) != -1) {
            System.out.println(new String(buff, 0, read));//输出方法一
        }
        while ((read = reader.read(buff)) != -1) {
            System.out.println(new String(buff, 0, read));//输出方法二
        }
        writer.close();
        streamReader.close();
        streamWriter.close();
    }
}
