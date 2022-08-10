package JavaExamples;
abstract  class Harika{
	abstract void m1();
	abstract void m2();
}
class Masthan extends Harika {
	public void m1() {
		System.out.println("he is brother");}
			public void m2() {
				System.out.println("he is cool");}
}
class Kavya extends Harika{
	public void m1() {
		System.out.println("she is best friend");}
	public void m2() {
		System.out.println("it can be staying with same hostel");}
	
	}
public class Amarnath extends Harika{
	public void m1() {
		System.out.println("best lovers ");}
	public void m2() {
		
		System.out.println("made for each other");}
	public static void main(String args[]) {
		Amarnath obj= new Amarnath();
		obj.m1();
		obj.m2();
		Masthan obj1= new Masthan();
		obj1.m1();
		obj1.m2();
		Kavya obj2= new Kavya();
		obj2.m1();
		obj2.m2();
		
		
	}

}
