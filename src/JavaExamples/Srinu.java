package JavaExamples;

abstract class Nagaraja{
	abstract void m1();
	abstract void m2();
}
class Kalpana extends Nagaraja {
	public void m1() {
		System.out.println("sewwt mom");}
	public void m2() {
		System.out.println(" she is very genius");}
}
	class Govind extends Nagaraja {
	public void m1() {
		System.out.println("he worked i police job");}
	public void m2() {
		System.out.println("he is most intelgent guy");}
	
	}
	
	
public class Srinu {
	public void m1() {
		System.out.println("he worked i police job");}
	public void m2() {
		System.out.println("he is most intelgent guy");}
	
	
	public static void main(String args[]) {
		Kalpana t=new Kalpana();
		t.m1();
		t.m2();
		
		
		Govind obj1= new Govind();
		obj1.m1();
		obj1.m2();
		
		Srinu obj2= new Srinu();
		obj2.m1();
		obj2.m2();
		
	}

}
