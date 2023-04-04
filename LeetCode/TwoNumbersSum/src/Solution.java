import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0;i < n;i++) {
            nums[i] = input.nextInt();
        }
        int target = input.nextInt();
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target); //返回的是数组，所以用数组来存取
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>(nums.length-1); //长度限制，避免浪费性能
        for (int i = 0; i < nums.length; i++) {
            int numsTarget = target - nums[i]; //另外一个值
            if (hashMap.containsKey(numsTarget)) {
                return new int[]{hashMap.get(numsTarget), i}; //get返回键对应的值
            }
            hashMap.put(nums[i], i); //添加一组键和值
        }
        return new int[0];
    }
}