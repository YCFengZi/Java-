package IO.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());//���ַ���ת��ΪX���������Ĭ��10����
        String[] str = bufferedReader.readLine().split(" ");
        Set<String> set = new HashSet<>();
        for (String s : str) {
            set.add(s);
        }
        if (n == set.size()) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
        bufferedReader.close();
    }
}