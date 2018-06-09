package pb3;

class BombComputer{
	boolean power;
	
	public void powerOn() {
		power=true;
		System.out.println("전원 ON");
	}
	public void powerOff() {
		power=false;
		System.out.println("전원 OFF");
	}
	public void process() throws Exception{
		System.out.println("작업1");
		System.out.println("작업2");
		throw new Exception("작업3, 펑~");
	}
}
public class pb3 {

	public static void main(String[] args) {
		
		BombComputer bc = new BombComputer();
		try {
			bc.powerOn();
			bc.process();
			
		} catch (Exception e) {
			System.out.println("컴퓨터가 폭발하였습니다. 조치바람.");
		} finally {
			bc.powerOff();
		}

	}

}
