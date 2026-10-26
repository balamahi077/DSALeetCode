class Solution {
    public int[] buildArray(int[] nums) {

        if(nums == null || nums.length == 0)
            return new int[]{-1};

        int[] newArray = new int[nums.length];
        for(int index = 0; index < nums.length; index++)
        {
            int nextVisit = nums[nums[index]];
            newArray[index] = nextVisit;
        }

        return newArray;
        
    }
}