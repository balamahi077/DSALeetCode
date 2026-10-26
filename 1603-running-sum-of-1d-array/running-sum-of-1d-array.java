class Solution {
    public int[] runningSum(int[] nums) {

        if(nums == null || nums.length == 0)
            return new int[]{-1};

        int sum = 0;
        int[] sumOfArray = new int[nums.length];

        for(int index = 0; index < nums.length; index++)
        {
            sum += nums[index];
            sumOfArray[index] = sum;
        }
        return sumOfArray;
        
    }
}