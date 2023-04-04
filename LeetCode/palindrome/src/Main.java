import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Solution solution = new Solution();
        int n = input.nextInt();
        System.out.println(solution.isPalindrome(n));
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int number = 0;
        if (x < 0) {
            return false;
        } else if(x == 0) {
            return true;
        } else {
            while(temp != 0) {
                number = number * 10 + temp % 10;
                temp /= 10;
            }
        }
        return number == x;
    }
}