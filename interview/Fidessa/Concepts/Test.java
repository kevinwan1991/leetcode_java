package Fidessa.Concepts;

public class Test {
	public static boolean foo(){
		System.out.println("called foo");
		return true;
	}
	
	public static boolean bar(){
		System.out.println("called bar");
		return false;
	}
	
	public static void main(String[] args){
		int a=2;
		int b=4;
		
		System.out.println(a|b);// 10 | 100 -> 110=6;
		System.out.println(foo()|bar());
		System.out.println(foo()||bar());
	}
}
