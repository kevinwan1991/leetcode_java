package Dates_Calculation;

public class Solution {
	public int daysBtw(Date date1, Date date2){
		int[] months={0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		int days1=helper(date1,months);
		days1+=date1.day;
		int days2=helper(date2,months);
		days2+=date2.day;
		
		int days=days2-days1;
		for(int i=date1.year; i<date2.year; i++){
			if(isYeap(i))
				days+=366;
			else
				days+=365;
		}
		return days;
	}
	
	public int helper(Date date, int[] months){
		int days=0;
		for(int i=1; i<=date.month-1; i++){
			if(i==2 && isYeap(date.year))
				days+=29;
			else
				days+=months[i];
		}
		return days;
	}
	
	public boolean isYeap(int year){
		if((year%100!=0 && year%4==0) || (year%100==0 && year%400==0))
			return true;
		else
			return false;
	}
	
	class Date{
		int year;
		int month;
		int day;
		public Date(int year, int month, int day){
			this.year=year;
			this.month=month;
			this.day=day;
		}
	}
	
	public static void main(String[] args){
		Solution solution=new Solution();
		Solution.Date date2=solution.new Date(2015, 11, 17);
		Solution.Date date1=solution.new Date(2000, 1, 1);
		System.out.println(solution.daysBtw(date1, date2));
	}
}
