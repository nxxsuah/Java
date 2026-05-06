package sub8;

public class PowerCable implements Socket {

	private Bulb bulb;
	
	public PowerCable(Bulb bulb) {
		this.bulb = bulb;
	}
		
	@Override
	public void swithOn() {
		bulb.lightOn();		
	}

	@Override
	public void swithOff() {
		bulb.lightOff();
	}

}
