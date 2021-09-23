package AbstractCeilingFan;

public class StateOffFactory implements AbstractFactory {

	@Override
	public Fan getFan() {
		// TODO Auto-generated method stub
		return new StateOffFan();
	}

}
