package pb3;

class BombComputer{
	boolean power;
	
	public void powerOn() {
		power=true;
		System.out.println("���� ON");
	}
	public void powerOff() {
		power=false;
		System.out.println("���� OFF");
	}
	public void process() throws Exception{
		System.out.println("�۾�1");
		System.out.println("�۾�2");
		throw new Exception("�۾�3, ��~");
	}
}
public class pb3 {

	public static void main(String[] args) {
		
		BombComputer bc = new BombComputer();
		try {
			bc.powerOn();
			bc.process();
			
		} catch (Exception e) {
			System.out.println("��ǻ�Ͱ� �����Ͽ����ϴ�. ��ġ�ٶ�.");
		} finally {
			bc.powerOff();
		}

	}

}
