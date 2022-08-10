package JavaExamples;

public class Amar_St {
int b=10;
static int empid =100;
public void m1() {
	int a=20;
	System.out.println("amar is good boy");
	System.out.println("local varible"+a);
	System.out.println("instance varible"+b);}

	public void m2() {
		System.out.println("amar is very intelgent boy");
		System.out.println("instance varible"+b);
		System.out.println("static varible"+empid);}
	public void m3() {
		System.out.println("amar is lover boy");
		System.out.println("instance varible"+b);
		System.out.println("static varible"+empid);}
	public static void st() {
		System.out.println("staic method is excuted");}
		public static void main(String args[]) {
			Amar_St m =new Amar_St ();
			m.m1();
			m.m2();
			m.m3();
			Amar_St.st();
		
	
	
		}
		
		
	
}

