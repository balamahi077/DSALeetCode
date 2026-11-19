class Solution {
    public int subtractProductAndSum(int n) {

        int productTotal = 1;
        int sumTotal = 0;

        while(n > 0)
        {
            int copyNum = n % 10;
            productTotal *= copyNum;
            sumTotal += copyNum;
            n = n / 10;
        }
        return productTotal - sumTotal;
        
    }
}