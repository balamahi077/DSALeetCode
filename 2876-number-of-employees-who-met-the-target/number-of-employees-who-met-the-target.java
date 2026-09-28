class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

        int count = 0;
        for(int index = 0; index < hours.length; index++) {
            if(hours[index] >= target) {
                count++;
            }
            else {
                continue;
            }
        }
        return count;
        
    }
}