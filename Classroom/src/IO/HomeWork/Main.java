package IO.HomeWork;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //�����ļ�
        try {
            String Str = input.nextLine();
            File file = new File("F:\\Java����\\Classroom\\src\\IO\\test/" + Str + ".txt");
            if (file.createNewFile()) {
                System.out.println("�ļ������ɹ���" + file.getName());
            } else {
                System.out.println("�ļ��Ѿ�����");
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("F:\\Java����\\Classroom\\src\\IO\\test/" + Str + ".txt"));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("F:\\Java����\\Classroom\\src\\IO\\test/" + Str + ".txt",true));
            String name = "����������\n";
            String weather = "����������\n";
            String title = "���⣺���������޴�սֻ��\n";
            String content = "���ݣ�����69����\n";
            byte[] buffName = name.getBytes();
            byte[] buffWeather = weather.getBytes();
            byte[] buffTitle = title.getBytes();
            byte[] buffContent = content.getBytes();
            bufferedOutputStream.write(buffName);
            bufferedOutputStream.write(buffWeather);
            bufferedOutputStream.write(buffTitle);
            bufferedOutputStream.write(buffContent);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        } catch (Exception e) {
            System.out.println("���ִ���");
            System.out.println(e.getMessage());
        }
    }
}
