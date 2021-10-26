import java.util.*;

class Solution {
    public boolean isPowerOfTwo(int n) {
        return power(n);
    }
    public static boolean power(int n){
        if(n==0) return false;
        if(n==1) return true;
        if(n%2==1) return false;
        return power(n/2);
    }
}
