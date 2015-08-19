package Fidessa.SpartanNum;

import java.util.HashMap;

public class Solution {
	private static int ConvertSpartanNumeral(String sn) {
        if(sn==null || sn.length()==0)
               return 0;
        
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('E',3);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        
        char[] arr=sn.toCharArray();
        int res=map.get(arr[0]);
        boolean ifInc=true;
        for(int i=1; i<sn.length(); i++){
            if(map.get(arr[i])>map.get(arr[i-1])){
                res+=map.get(arr[i]);
                ifInc=true;
            }else if(map.get(arr[i])>map.get(arr[i-1])){
                res-=map.get(arr[i]);
                ifInc=false;
            }else
                res=ifInc?(res+map.get(arr[i])):(res-map.get(arr[i]));
        }
        return res;                                               
    }
	
	public int toInt(String str){
		if(str==null || str.length()==0)
			return 0;
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		map.put('I',1);
		map.put('E',3);
		map.put('V',5);
		map.put('X',10);
		map.put('L',50);
		
		char[] arr=str.toCharArray();
		int res=map.get(arr[0]);
		boolean ifInc=true;
		for(int i=1; i<str.length(); i++){
			if(map.get(arr[i])>map.get(arr[i-1])){
				res+=map.get(arr[i]);
				ifInc=true;
			}else if(map.get(arr[i])<map.get(arr[i-1])){
				res-=map.get(arr[i]);
				ifInc=false;
			}else
				res=ifInc?(res+=map.get(arr[i])):(res-=map.get(arr[i]));
		}
		return res;
	}
	
	
	public static void main(String[] args){
		Solution s=new Solution();
		//s.toInt("IIIE");
		s.toInt("VEEIIL");
		System.out.println("II: "+s.ConvertSpartanNumeral("II"));
		System.out.println("VII: "+s.ConvertSpartanNumeral("VII"));
		System.out.println("VX: "+s.ConvertSpartanNumeral("VX"));
		System.out.println("LVVV: "+s.ConvertSpartanNumeral("LVVV"));
		System.out.println("LIX: "+s.ConvertSpartanNumeral("LIX"));
		System.out.println("VIIXL: "+s.ConvertSpartanNumeral("VIIXL"));
		System.out.println("EXL: "+s.ConvertSpartanNumeral("EXL"));
	}
}
