package collection;
//作业：定义一个Student类，属性有id，name，sex，phone（手机号码），address（家庭地址）
//main函数完成以下功能，创建一个集合，用于存储学生，并完成功能的增、删、改、查功能

import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayListTest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Person[] person2 = new Person[n];
        ArrayList<Person> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            person2[i] = new Person(input.next(), input.nextInt(), input.next());
            arrayList.add(person2[i]);
        }
        int flag1 = 0;
        int flag2 = 0;
        int flag3 = 0;
        for (int i = 0; i < n; i++) {
            if (arrayList.get(i).getName().contains("小五") && flag1 == 0) {
                flag1 = 1;
                System.out.println("小五在的");
            }
            if (arrayList.get(i).getName().contains("六哥") && flag2 == 0) {
                flag2 = i;
                System.out.println(arrayList.get(i));
                person2[i] = new Person("牛爷爷", 65, "男");
            }
            if (arrayList.get(i).getName().contains("吴凡") && flag3 == 0) {
                flag3 = i;
            }
        }
        if (flag2 != 0) {
            arrayList.set(flag2,person2[flag2]);
        }
        if (flag3 != 0) {
            arrayList.remove(person2[flag3]);
        }
        if (n == 1 && !(arrayList.get(0).getName().equals("吴凡"))) {
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i));
            }
        }
    }
}