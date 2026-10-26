class Solution {
    public int removeElement(int[] nums, int val) {

        if(nums == null || nums.length == 0)
            return 1;

        if(nums.length == 1)
        {
            if(nums[0] == val)
                return 0;
        }

        if(nums.length == 2)
        {
            if(nums[0] == val && nums[1] == val)
                return 0;
        }

        int count = 0;
        int left = 0;
        int right = nums.length -1;

        while(right >= left)
        {
            if(nums[right] == val)
            {
                nums[right] = nums[right] / 10;
                right--;
                count++;
            }
            else if(nums[left] == val)
            {
                nums[left] = nums[right];
                nums[right] = nums[right] / 10;
                left++;
                right--;
                count++;
            }
            else
                left++;
        }
        return nums.length - count;
        
    }
}