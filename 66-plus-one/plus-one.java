class Solution {
    public int[] plusOne(int[] digits) {

        int i = digits.length-1;
        while(i > -1)
        {
            if(digits[i] == 9)
            {
                digits[i] = 0;
            }
            else
            {
                digits[i] += 1;
                break;
            }
            i--;
        }
        if(i == -1)
        {
            int[] newArray = new int[digits.length+1];
            newArray[0] = 1;
            return newArray;

        }
        return digits;  
    }
}