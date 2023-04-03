import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<results> results = new ArrayList<results>();
        results.add(new results(1,500,400,"职工1","female"));
        results.add(new results(2,400,600,"职工2","female"));
        results.add(new results(3,600,300,"职工3","male"));
        results.add(new results(4,800,200,"职工4","female"));
        results.add(new results(5,500,700,"职工5","male"));
        Collections.sort(results);
        System.out.println("编号,团险,个险,姓名,性别");
        for (results results1 : results) {
            System.out.println(results1.toString());
        }
        Collections.sort(results,new PscoreComparator());
        System.out.println("编号,团险,个险,姓名,性别");
        for (results results2 : results) {
            System.out.println(results2.toString());
        }
    }
}

class results implements Comparable<results> {
    private int number;
    private int tscore;
    private int pscore;
    private String name;
    private String sex;

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getTscore() {
        return tscore;
    }
    public void setTscore(int tscore) {
        this.tscore = tscore;
    }
    public int getPscore() {
        return pscore;
    }
    public void setPscore(int pscore) {
        this.pscore = pscore;
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

    public results() {}
    public results(int number, int tscore, int pscore, String name, String sex) {
        this.number = number;
        this.tscore = tscore;
        this.pscore = pscore;
        this.name = name;
        this.sex = sex;
    }
    @Override
    public int compareTo(results o) {
        return Integer.compare(this.getPscore() + this.tscore,o.getPscore() + o.getTscore());
    }
    @Override
    public String toString() {
        return number + "," + tscore + "," + pscore + "," + name + "," + sex;
    }
}

class PscoreComparator implements Comparator<results> {
    @Override
    public int compare(results o1, results o2) {
        return Integer.compare(o1.getTscore(),o2.getTscore());
    }
}