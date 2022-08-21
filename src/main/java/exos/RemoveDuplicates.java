package exos;

public class RemoveDuplicates {
	public static int removeDuplicates(int[] nums) {
		int current = nums[0], nb = 1;
        for (int i = 1; i < nums.length; i++) {
        	if (nums[i] != current) {
        		nums[nb] = nums[i];
        		current = nums[i];
        		nb += 1;
        	}
        }
        return nb;
    }
}
