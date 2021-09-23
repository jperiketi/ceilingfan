package AbstractCeilingFan;

public class StateOnFactory implements AbstractFactory {

	@Override
	public Fan getFan() {
		// TODO Auto-generated method stub
		return new StateOnFan();
	}

}
