package exos;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        boolean found = false;
        for (int i = 0; i < nums.length && !found; i++) {
            output[0] = i;
            for (int j = i+1; j < nums.length && !found; j++) {
                if (nums[output[0]] + nums[j] == target) {
                    output[1] = j;
                    found = true;
                }
            }
        }
        return output;
    }
}
