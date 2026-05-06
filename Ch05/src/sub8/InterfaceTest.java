package sub8;
/*
 * 날짜 : 2026/05/06
 * 이름 : 남수아
 * 내용 : Java 추상클래스 실습 
 */
public class InterfaceTest {
	
	public static void main(String[] args) {
		
		// 인터페이스 활용 1: 표준화(같은) 된 클래스를 설계, 활용할 수 있다
		RemoteControl lg = new RemoteLG(); // 다형성, 업캐스팅
		lg.powerOn();
		lg.chDown();
		lg.soundUp();
		lg.powerOff();
		
		RemoteControl samsung = new RemoteSamsung();
		samsung.powerOn();
		samsung.chDown();
		samsung.soundUp();
		samsung.powerOff();
		
		
		
		// 인터페이스 활용 2: 모듈간 결합도 완화(유연성)		
		Bulb bulb = new Bulb();
		Socket socket = new PowerCable(bulb);
		
		socket.swithOn();
		socket.swithOff();
		
		
		
		// 인터페이스 활용 3: 다중 상속 '효과' (extends & implements)
		SmartTV stv = new SmartTV();
		
		stv.powerOn();
		stv.connection();
		stv.surf();
		stv.chUp();		
		
		stv.process();
		stv.save();
					
	}

}
