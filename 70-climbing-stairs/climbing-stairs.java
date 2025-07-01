class Solution {
    public int climbStairs(int n) {
        
        

        if(n <= 3){
            return n;
        }

        int start = 3;
        int add = 2;
        int total = 0;

        n = n-3;
        while(n > 0){
            total = start + add;
            add = start;
            start = total;
            
            n--;
        }
    return total;
    }
}