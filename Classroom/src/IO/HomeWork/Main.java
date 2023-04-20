package IO.HomeWork;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //创建文件
        try {
            String Str = input.nextLine();
            File file = new File("F:\\Java代码\\Classroom\\src\\IO\\test/" + Str + ".txt");
            if (file.createNewFile()) {
                System.out.println("文件创建成功：" + file.getName());
            } else {
                System.out.println("文件已经存在");
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("F:\\Java代码\\Classroom\\src\\IO\\test/" + Str + ".txt"));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("F:\\Java代码\\Classroom\\src\\IO\\test/" + Str + ".txt",true));
            String name = "姓名：马报国\n";
            String weather = "天气：娃娃\n";
            String title = "标题：闪电五连鞭大战只因\n";
            String content = "内容：今年69岁了\n";
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
            System.out.println("出现错误");
            System.out.println(e.getMessage());
        }
    }
}
