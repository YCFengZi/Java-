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
interface RR{
    double mark();
}
class RT implements RR{
    int[] grade;
    public RT(int[] grade){
        this.grade = grade;
    }
    public double mark() {
        double sum = 0;
        for (int i = 1;i < grade.length-1;i++) {
            sum += grade[i];
        }
        return sum / 3.0;
    }
}