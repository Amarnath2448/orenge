package JavaExamples;
interface Papaya {
	public void m1();
	public void m2();
	
}
class Lemon implements Papaya {
	public void m1() {
		System.out.println("lemon is very teasty");}
	
		public void m2() {
			System.out.println("elase its woresty");}
}
class Banana implements Papaya {
	public void m1() {
	System.out.println("amar is very intelgent");}
	public void m2() {
		System.out.println("masthan is my blood");}
	}
	
	

		

public class Mango implements Papaya {
public void m1() {
	System.out.println("mama is frd");}
public void m2() {
	System.out.println("naresh it");}

public static void main(String args[]) {
	Papaya obj=new Mango();
	obj.m1();
	obj.m2();
	Papaya object=new Lemon();
	object.m1();
	object.m2();	
	Papaya object1=new Banana();
	object1.m1();
	object1.m2();
	
	
	
}	
}

