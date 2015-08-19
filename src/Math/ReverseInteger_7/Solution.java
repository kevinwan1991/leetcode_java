package Math.ReverseInteger_7;

// 1. reverse bigger than Integer.MAX_VALUE overflow!!!
// 2. 0s at the tail and what if it is 0!!!!
public class Solution {
    public int reverse(int x) {
        boolean isNegative=false;
        if(x<0){
            isNegative=true;
            x=-x;
        }
        
        int num=x;
        while(num%10==0 && num!=0){//here!!!!
            num/=10;
        }
        
        double res=0;
        while(num!=0){
            res*=10;
            
            int digit=num%10;
            res+=digit;
            
            num/=10;
        }
        
        if(isNegative)
            res*=(-1);
        if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE)//here!!!!!
            return 0;
        return (int)res;
    }
}