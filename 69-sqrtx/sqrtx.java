class Solution {
    public int mySqrt(int x) {

        // long n = 1,sum;
        // sum = n * n;

        // if(x != 1)
        // {
        //     while(x >= sum)
        //     {
        //         n++;
        //         sum = n * n;
        //     }
            
        // }
        // else
        // {
        //     return (int)n;
        // }
        // return (int)(n-1);

        long r = x;
        while(r * r > x){
            r = (r + x / r) / 2;
        }
        return (int) r;

    }
}