package IO.file;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        test1();
        test2();
        test3();
        test4();
    }

    private static void test4() {
        System.out.println("……");
        File file = new File("F:\\Java代码\\Classroom\\src\\IO\\test");
        if (file.isDirectory()) {
            String[] list = file.list(new MyFileNameFilter());
            for (String name : list) {
                System.out.println(name);
            }
        }
    }

    private static void test3() {
        File file = new File("F:\\Java代码\\Classroom\\src\\IO\\test");
        File f1 = new File(file, "cs.txt");

        if (f1.exists()) {
            System.out.println("文件存在,So我们要删除掉它");
        } else {
            System.out.printf("检测到文件不存在,我们将在" + file + "这里创建一坨文件\n");
            try {
                f1.createNewFile();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.printf("……\n" + "文件创建成功,创建位置在" + file + "\n");
        }
    }

    private static void test2() {
        File file = new File("F:\\Java代码\\Classroom\\src\\IO\\test");
        File f1 = new File(file, "cs.txt");
        for (int i = 0; i < 2; i++) {
            if (f1.exists()) {
                System.out.println("即将进行以下操作:删除文件");
                f1.delete();
            } else {
                System.out.printf("正在进行的操作是:文件删除\n……\n文件删除成功\n");
                break;
            }
        }
    }

    private static void test1() {
//        File f1 = new File("F:\\Java代码\\Classroom\\src\\IO\\test\\cs.txt");
//        File f1 = new File("F:\\Java代码\\Classroom\\src\\IO\\test","cs.txt");
        File file = new File("C:\\Java\\untitled");
        File f1 = new File(file, "abc.txt");
        if (f1.exists()) {
            System.out.println("文件存在");
        } else {
            System.out.println("文件不存在");
        }
    }
}

//文件过滤器
class MyFileNameFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        //dir:路径;name文件名
        File f1 = new File(dir, name);
        if (f1.isFile() && name.endsWith(".java")) {
            return true;
        }
        return false;
    }
}