package Amar.H;
interface Bunny {
	public void pass();
	public void fail();
}
class A implements Bunny{
	public void pass() {
		System.out.println("you get 35 marks you will be pass");}
	public void fail() {
		System.out.println("you get beloe 35 marks you will be fail");}
}

	class H implements Bunny{
		public void pass() {
			System.out.println("you got an a placement");}
		public void fail() {
			System.out.println("next time better luck");}
		
		}
		
public class Amar implements Bunny {
public void pass() {
	System.out.println("you got an job");}
public void fail() {
	System.out.println("you loss the job");}

public static void main(String args[]) {
	
Bunny object = new A();
object.pass();
object.fail();

Bunny obj = new H();
obj.pass();
obj.fail();
Bunny obj1 = new Amar();
obj1.pass();
obj.fail();
}
}



