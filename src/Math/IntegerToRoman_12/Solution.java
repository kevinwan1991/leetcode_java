package Math.IntegerToRoman_12;

public class Solution {
    public String intToRoman(int num) {
        if(num<=0)
            return "";
            
        //Roman number goes by '5'(not 10)!!!  
        //Sorted 'hashmap':
        String[] symbols=new String[]{"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int[] nums=          new int[]{1,  4,   5,  9,  10,  40,  50, 90, 100, 400,500,900, 1000};
        
        StringBuilder sb=new StringBuilder();
        int pt=symbols.length-1;
        while(pt>=0){
            if(num>=nums[pt]){
                sb.append(symbols[pt]);
                num-=nums[pt];
            }else{
                pt--;
            }
        }
        return sb.toString();
    }
}