package List;

import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("张三");
        linkedList.add("李四");
        linkedList.add("王五");
        linkedList.add(2, "小六");
        System.out.println(linkedList);
        int index = linkedList.indexOf("小六");
        if (index >= 0) {
            System.out.println(index);
        } else {
            System.out.println("查无此人");
        }
        //迭代器
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o.equals("张三")) {
                iterator.remove();//用迭代器来删除
                continue;
            }
            System.out.println(o);
        }
        //正常遍历
        for (Object o : linkedList) {
            System.out.println(o);
        }
    }
}