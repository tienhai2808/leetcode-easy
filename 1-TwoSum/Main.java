import java.util.HashMap;
import java.util.Map;

class Solution {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> m = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (m.containsKey(complement)) {
        return new int[] { m.get(complement), i };
      }
      m.put(nums[i], i);
    }

    return new int[0];
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] result = sol.twoSum(new int[] { 2, 7, 11, 12 }, 9);
    System.out.println("[" + result[0] + ", " + result[1] + "]");
  }
}
