package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "张三");
        map.put(2, "李四");
        map.put(3, "小五");
        String str = map.get(2);
        System.out.println(str);
        System.out.println(map);
        map.remove(2);
        System.out.println(map);
        Set<Integer> keys = map.keySet();
//        for (Integer i : keys) {
//            String value = map.get(i);
//            System.out.println(i + ":" + value);
//        }
        //遍历:把一个映射看成一个对象
        System.out.println("把一个映射看成一个对象");
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry entry : entrySet) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}