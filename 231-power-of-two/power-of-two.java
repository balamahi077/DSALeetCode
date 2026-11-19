class Solution {
    public boolean isPowerOfTwo(int n) {

        // if(n == 1 || n == 2)
        //     return true;
        // int power = 2;

        // for(int i = 0; i < n; i++)
        // {
        //     power *= 2;
        //     if(power == n)
        //     {
        //         return true;
        //     }
        // }
        // return false;

        return n > 0 && (n & (n - 1)) == 0;
    }
}