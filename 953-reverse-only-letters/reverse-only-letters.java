class Solution {
    public String reverseOnlyLetters(String s) {

        char[] arr = s.toCharArray();
        int j = 0;
        int k = arr.length-1;
        
        for(int i = 0; i <= arr.length; i++)
        {
            boolean frontStatus = false;
            boolean rearStatus = false;
            
            if(j >= k)
                break;

            if((arr[j] >= 'a'&&arr[j] <='z') || (arr[j]>='A'&&arr[j]<='Z'))
            {
                frontStatus = true;
            }

            if((arr[k] >= 'a'&&arr[k]<='z') || (arr[k]>='A'&&arr[k]<='Z'))
            {
                rearStatus = true;
            }

            if(frontStatus && rearStatus)
            {
                char temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                j++;
                k--;
            }
            else if(!frontStatus)
                {
                    arr[j] = arr[j];
                    j++;
                }
                else
                {
                    arr[k] = arr[k];
                    k--;
                }

        }
        
        return new String(arr);
    }
}