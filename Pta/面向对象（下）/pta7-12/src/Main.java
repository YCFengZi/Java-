import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] grade = new int[5];
        for(int i=0; i<grade.length; i++){
            grade[i] = in.nextInt();
        }

        RR rr = new RT(grade);
        double dd = rr.mark();
        System.out.printf("%.2f",dd);
    }
}
abstract class RR{
    int[] grade;
    public RR(int[] grade){
        this.grade = grade;
    }
    public abstract double mark();
}

class RT extends RR{
    public RT(int[] grade) {
        super(grade);
    }
    @Override
    public double mark() {
        double sum = 0;
        for (int i = 1;i < grade.length-1;i++) {
            sum += grade[i];
        }
        return sum/3.0;
    }
}