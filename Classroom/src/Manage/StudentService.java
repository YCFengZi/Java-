package Manage;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    List<Students> list = new ArrayList<>();
    public boolean add(Students students) {
        return list.add(students);
    }
    public List<Students> findAll() {
        return list;
    }
    public boolean update(int index,Students stu) {
        Students s = list.get(index);
        if (s == null) {
            return false;
        }
        s.setId(stu.getId());
        s.setName(stu.getName());
        s.setAge(stu.getAge());
        s.setScore(stu.getScore());
        return true;
    }
    public boolean delect(int index) {
        Students s = list.get(index);
        if (s == null) {
            return false;
        }
        list.remove(index);
        return true;
    }

    public int findIndexOf(String name) {
        int i = 0;
        for (i = 0;i < this.list.size();i++) {
            if (this.list.get(i).getName().equals(name)) {
                break;
            }
        }
        if (i == this.list.size()) {
            return -1;
        } else {
            return i;
        }
    }
}

//class StudentManagetool {
//    ArrayList<Student> stuList = new ArrayList<Student>();
//    //增加
//    public void add(Student stu) {
//        stuList.add(stu);
//    }
//    //删除
//    public void delect(int index) {
//        stuList.remove(index);
//    }
//    //修改
//    public void update(int index,Student s) {
//        stuList.set(index,s);
//    }
//    //查找
//    public boolean find(String name) {
//        int i = 0;
//        for (i = 0; i < this.stuList.size(); i++) {
//            if (this.stuList.get(i).getName().equals(name)) {
//                break;
//            }
//        }
//        if (i == this.stuList.size()) {
//            return false;
//        } else {
//            return true;
//        }
//    }
//    public int findIndexOf(String name) {
//        int i = 0;
//        for (i = 0;i < this.stuList.size();i++) {
//            if (this.stuList.get(i).getName().equals(name)) {
//                break;
//            }
//        }
//        if (i == this.stuList.size()) {
//            return -1;
//        } else {
//            return i;
//        }
//    }
//    //返回Student实例
//    public Student get(int index) {
//        return stuList.get(index);
//    }
//}

