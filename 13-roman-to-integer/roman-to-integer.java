class Solution {
    public int romanToInt(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = findSymbolIdxValue(s.charAt(i));

            if (i + 1 < s.length()) {

                int next = findSymbolIdxValue(s.charAt(i + 1));

                if (current < next) {
                    count -= current;
                }
                else {
                    count += current;
                }

            }
            else {
                count += current;
            }
        }

        return count;
        
    }

    public static int findSymbolIdxValue(char c)
    {
        char[] romanSymbol = {'I','V','X','L','C','D','M'};
        int[] romanSymbolValue = {1,5,10,50,100,500,1000};

        int idx = -1;
        for(int i = 0; i < romanSymbol.length; i++)
        {
            if(c == romanSymbol[i])
            {
                idx = i;
                break;
            }
        }
        return romanSymbolValue[idx];
    }
}