package IO.Reader;

import java.io.*;
import java.util.Scanner;

public class BufferedTest {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new FileReader("F:\\Java代码\\Classroom\\src\\IO\\test/马老师的日记本.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("F:\\Java代码\\Classroom\\src\\IO\\test/马老师的日记本.txt",true));
        String str = null;
        writer.newLine();
        writer.append("追加第1行");
        writer.newLine();
        writer.append("追加第2行");
        System.out.println("请输入学号，姓名，年龄");
        for (int i = 0; i < 2; i++) {
            String str2 = input.nextLine();
            writer.newLine();
            writer.append(str2);
        }
        writer.flush();
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
        reader.close();
        writer.close();
    }
}
