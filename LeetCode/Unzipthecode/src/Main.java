import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0;i < n;i++) {
             nums[i] = input.nextInt();
        }
        Solution solution = new Solution();
        int[] result = solution.decompressRLElist(nums);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0;i < result.length;i++) {
            arrayList.add(result[i]);
        }
        System.out.println(arrayList);
    }
}

class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0;i < nums.length;i+=2) {
            int freq = nums[i];
            int val = nums[i+1];
            for (int p = 0;p < freq;p++) {
                arrayList.add(val);
            }
        }
        int[] res = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            res[i] = arrayList.get(i);
        }
        return res;
    }
}