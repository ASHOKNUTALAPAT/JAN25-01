package java8;

interface Left{
	default void m1() {
		System.out.println("inside Left m1()");
	}
}

interface Right{
	default void m1() {
		System.out.println("inside Right m1()");
	}
}
public class Java8Demo implements Left,Right{
	
	public void m1() {
		System.out.println("overridden m1()");
		Left.super.m1();
		Right.super.m1();
	}

	public static void main(String[] args) {
	
		Java8Demo j=new Java8Demo();
		j.m1();
		//j.m1();
		
	}

}
