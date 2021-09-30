package yahiya;

public class LightBulb {

	public static void main(String[] args) {
		LightContext context = new LightContext();
		State lightONState = new LightONState();
		State lightOFFState = new LightOFFState();
		
		context.setState(lightONState);
		context.doAction();
		
		
		context.setState(lightOFFState);
		context.doAction();
		
	}

}