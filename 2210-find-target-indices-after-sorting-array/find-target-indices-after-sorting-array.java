class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        mergeSort(nums, 0, nums.length-1);

        ArrayList<Integer> arr = new ArrayList<>();

        for(int index = 0; index < nums.length; index++)
        {
            if(nums[index] == target)
            {
                arr.add(index);
            }
        }
        return arr;
        
    }

    public static void mergeSort(int[] nums, int low, int high)
    {

        if(low >= high)
            return;

        int mid = low + (high - low) / 2;

        mergeSort(nums, low, mid);

        mergeSort(nums, mid+1, high);

        merge(nums, low, mid, high);
    }

    public static void merge(int[] nums, int low, int mid, int high)
    {

        int i = low;
        int j = mid+1;
        int k = 0;

        int[] newArray = new int[high - low +1];

        while(i <= mid && j <= high)
        {
            if(nums[i] <= nums[j])
            {
                newArray[k] = nums[i];
                i++;
            }
            else
            {
                newArray[k] = nums[j];
                j++;
            }
            k++;
        }

        while(i <= mid)
        {
            newArray[k] = nums[i];
            i++;
            k++;
        }

        while(j <= high)
        {
            newArray[k] = nums[j];
            j++;
            k++;
        }

        for(i = low, k = 0; i <= high; i++,k++)
        {
            nums[i] = newArray[k];
        }
    }
}