package Instrument;

public class Piano extends Instrument{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument p=new Piano();
		p.volumeDown(); p.volumeUp(); p.play();
	}
	public void play() {
		System.out.println("Piano : play() ȣ���");
	}
	public void volumeUp() {
		System.out.println("Piano : volumeUp() ȣ���");
	}
	public void volumeDown() {
		System.out.println("Piano : volumeDown() ȣ���");
	}
}
