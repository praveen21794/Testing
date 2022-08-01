package overriding;

public class Test2 extends Test {
	public void fixed(){
		System.out.println("13%");
        super.fixed();
        
	}
public static void main(String[] args) {
	Test2 t = new Test2();
	t.fixed();
}
}
