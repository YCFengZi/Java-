package templatejdbc;

import java.util.Map;

public class TemplateTest {
    public static void main(String[] args) throws Exception {
        MyTemplate myTemplate = new MyTemplate();
        for (Student l : myTemplate.findAllList()) {
            System.out.println(l.toString());
        }
        for (Map<String, Object> l : myTemplate.findAllListMap()) {
            System.out.println(l);
        }
        System.out.println(myTemplate.findByNameStudent("·ç×Ó"));
        System.out.println(myTemplate.findByNameMap("Atri"));
    }
}