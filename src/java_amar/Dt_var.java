package java_amar;

public class Dt_var {
int b=20
;
static int empid =101
;
public void m1()
{
	int a =10;
System.out.println("m1 is excuted");
System.out.println("local varible"+a);
System.out.println("instance varible"+b);}

  public void m2() {
	  System.out.println("m2 is excuted");
	  System.out.println("instance varible"+b);
	  System.out.println("static varible"+empid);
  }
  public void m3() {
	  System.out.println("m3 is excuted");
	  System.out.println("instance varible"+b);
	  System.out.println("static varible"+empid);
  }
  public static void st() {
	  System.out.println("static method is excuted");
	  
  }
  public static void main(String args[]) {
	  System.out.println("main method is excuted");
	  Dt_var m = new Dt_var();
	  m.m1();
	  
	  m.m2();
	  m.m3();
	
  }
  
	
  
  
	  



	
}

