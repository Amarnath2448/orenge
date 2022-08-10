package JavaExamples;
interface WebDriver{
	public void openapp();
	public void closeapp();
}
class FirefoxDriver implements WebDriver{
public void openapp() {
	System.out.println("openfirefox");}
public void closeapp() {
	System.out.println("closefirefox"); }
}
 public class Lucky implements WebDriver {
public void openapp() {
	System.out.println("openfirefox");}
public void closeapp() {
	System.out.println("closefirefox");
}

public static void main(String args[]) {

WebDriver  obj =new Lucky();
obj.openapp();
obj.closeapp();

}
 }

 



















































