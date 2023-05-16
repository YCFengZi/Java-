import java.util.Arrays;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        workers[0] = new Worker(1,"职工1","female",500,400);
        workers[1] = new Worker(2,"职工2","female",400,600);
        workers[2] = new Worker(3,"职工3","male",600,300);
        workers[3] = new Worker(4,"职工4","female",800,200);
        workers[4] = new Worker(5,"职工5","male",500,700);
        Arrays.sort(workers);
        System.out.println("编号,团险,个险,姓名,性别");
        for (Worker w : workers) {
            System.out.println(w);
        }
        Arrays.sort(workers,new MyComparator());
        System.out.println("编号,团险,个险,姓名,性别");
        for (Worker w : workers) {
            System.out.println(w);
        }
    }
}

class Worker implements Comparable<Worker> {
    private int id;
    private String name;
    private String sex;
    private int group;
    private int person;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getGroup() {
        return group;
    }
    public void setGroup(int group) {
        this.group = group;
    }
    public int getPerson() {
        return person;
    }
    public void setPerson(int person) {
        this.person = person;
    }

    public Worker(int id, String name, String sex, int group, int person) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.group = group;
        this.person = person;
    }

    @Override
    public int compareTo(Worker o) {
        return this.person+this.group-o.person-o.group;
    }
    @Override
    public String toString() {
        return id + "," + group + "," + person + "," + name + "," + sex;
    }
}

class MyComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker o1, Worker o2) {
        return o1.getGroup() - o2.getGroup();
    }
}