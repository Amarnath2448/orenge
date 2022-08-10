package JavaExamples;

interface Binni {
	public void pass();
	public void fail();
	
}

class G implements Binni {
	public void pass() {
		System.out.println("when you get above 35 you will pass");
	}
	public void fail() {
		System.out.println("When you get below 35 you will fail");
	}
}
class D implements Binni {
	public void pass() {
		System.out.println("Congratulations");
	}
	public void fail() {
		System.out.println("Poyyi savu");
	}
}

public class Guntur  implements Binni {
	public void pass() {
		System.out.println("you got reward");
	}
	public void fail() {
		System.out.println("mingey");
	}
public static void main(String args[]) {
	Binni object=new G();
	object.pass();
	object.fail();
	
	Binni obj=new D();
	obj.pass();
	obj.fail();
	
	Binni obj1=new Guntur();
	obj1.pass();
	obj1.fail();
	
}
}
