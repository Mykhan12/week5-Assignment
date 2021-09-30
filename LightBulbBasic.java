package yahiya;
public class LightBulbBasic {

	private String state="";
	
	public void setState(String state){
		this.state=state;
	}
	
	public void doAction(){
		if(state.equalsIgnoreCase("ON")){
			System.out.println("Light is turned ON");
		}else if(state.equalsIgnoreCase("OFF")){
			System.out.println("Light is turned OFF");
		}
	}

	public static void main(String args[]){
		LightBulbBasic bulb = new LightBulbBasic();
		
		bulb.setState("ON");
		bulb.doAction();
		
		bulb.setState("OFF");
		bulb.doAction();
	}

}