package IO.Reader;

import java.io.*;
import java.util.Scanner;

public class BufferedTest {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new FileReader("F:\\Java����\\Classroom\\src\\IO\\test/����ʦ���ռǱ�.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("F:\\Java����\\Classroom\\src\\IO\\test/����ʦ���ռǱ�.txt",true));
        String str = null;
        writer.newLine();
        writer.append("׷�ӵ�1��");
        writer.newLine();
        writer.append("׷�ӵ�2��");
        System.out.println("������ѧ�ţ�����������");
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
