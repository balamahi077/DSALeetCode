class Solution {
    public int[] sortedSquares(int[] nums) {
        
        if(nums == null || nums.length == 0)
            return new int[]{-1};

        for(int index = 0; index < nums.length; index++)
        {
            int squre = nums[index] * nums[index];  
            nums[index] = squre;   
        }
        bubbleSort(nums);
        return nums;
        
    }

    void bubbleSort(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }
}