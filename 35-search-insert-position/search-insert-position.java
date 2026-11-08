class Solution {
    public int searchInsert(int[] nums, int target) {

        if(nums[0] > target || nums[0] == target) 
            return 0;

        int found_idx = -1;
        boolean found = false;

        for(int i = 1; i < nums.length; i++)
        {

            if(nums[i] > target && nums[i-1] < target)
            {
                found = true;
                found_idx = i;
            }
            if(nums[i] == target)
            {
                found = true;
                found_idx = i;
            }
        }

        if(!found)
        {
            return nums.length;
        }
        return found_idx;
    }
}