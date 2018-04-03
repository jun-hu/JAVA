
public class Shape {

	double d1,d2;
	
	public Shape() {
		this.d1=20;
		this.d2=30;
	}
	public Shape(double d1, double d2) {
		this.d1=d1;
		this.d2=d2;
	}
	public void clacArea() {
		System.out.println("Shape:clacArea() 실행");
	}
//메소드 오버라이딩: 상위 클래스가 가지고 있는 메소드를 하위 클래스에서 재정의하여 사용하는 개념.
//메소드 오버로딩: 같은 이름의 메소드를 여러개 정의하여 매개변수의 형이나 개수에 따라 다른 기능을 하는 개념.
//인스턴스 변수와 클래스 변수는 둘다 클래스 영역에서 선언되지만 생성시기는 클래스 변수는 클래스가 메모리에 올라갈 때 인스턴스 변수는 인스턴스가 생성될 때 생성된다.
}

