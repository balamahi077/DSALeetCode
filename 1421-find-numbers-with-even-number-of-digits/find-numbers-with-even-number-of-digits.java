class Solution {
    public int findNumbers(int[] nums) {

        if(nums == null || nums.length == 0)
            return -1;

        int countEvenDigits = 0;

        for(int index = 0; index < nums.length; index++)
        {
            int countNumber = 0;
            int num = nums[index];
            while(num != 0)
            {
                    num = num / 10;
                    countNumber++;
                
            }
            
            if(countNumber == 0)
                countNumber = 0;
            else if(countNumber % 2 == 0)
                countEvenDigits++;
        }
        return countEvenDigits;

    }
}