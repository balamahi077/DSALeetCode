class Solution {
    public boolean checkString(String s) {

        boolean foundB = false;
        int idxOfB = -1;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != 'a')
            {
                foundB = true;
                idxOfB = i;
                break;
            }
        }
        
        if(foundB)
        {
            for(int i = idxOfB +1; i < s.length(); i++)
            {
                if(s.charAt(i) == 'a')
                    return false;
            }
        }
        
        return true;
    }
}