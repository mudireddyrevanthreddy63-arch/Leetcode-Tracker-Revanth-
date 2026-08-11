// Last updated: 11/08/2026, 14:21:50
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1) return false;
        if(n==1) return true;
        while(n%2==0)
        {
            n = n/2;
        }
        if(n==1)
        return true;
        else
        return false;
        
        
    }
}