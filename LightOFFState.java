package yahiya;

public class LightOFFState implements State {

	@Override
	public void doAction() {
		System.out.println("Light is turned OFF");
	}

}