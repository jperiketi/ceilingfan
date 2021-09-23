package AbstractCeilingFan;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory factory = new StateOnFactory();
		Fan f1 = factory.getFan();
		f1.display();
		
		AbstractFactory off = new StateOffFactory();
		Fan f2 = off.getFan();
		f2.display();
	}

}
