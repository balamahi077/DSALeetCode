class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        if(nums == null || nums.length == 0)
            return new int[]{-1};
        
        int[] countArray = new int[nums.length];
        for(int index = 0; index < nums.length; index++)
        {
            int count = 0;
            for(int j = 0; j < nums.length; j++)
            {
                if(nums[j] < nums[index])
                {
                    count++;
                }
            }
            countArray[index] = count;
        }
        return countArray;
    }
}