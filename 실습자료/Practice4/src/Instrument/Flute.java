package Instrument;

public class Flute extends Instrument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument f=new Flute();
		f.volumeDown(); f.volumeUp(); f.play();
	}
	void play() {
		System.out.println("Flute : play() ȣ���");
	}
	void volumeUp() {
		System.out.println("Flute : volumeUp() ȣ���");
	}
	void volumeDown() {
		System.out.println("Flute : volumeDown() ȣ���");
	}
}
