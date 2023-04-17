package HashSet;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Set<Person> integerSet = new TreeSet<Person>();
        for (int i = 0; i < n; i++) {
            integerSet.add(new Person(input.next(), input.nextInt()));
        }
        System.out.println(integerSet);
    }
}