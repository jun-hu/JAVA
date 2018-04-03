
public class Circle extends Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c= new Circle();
		c.clacArea();
		c.clacArea(30, 30);
		
	}
	public void clacArea() {
		System.out.println("Circle: calcArea()");
		System.out.println("¿øÀÇ ³ÐÀÌ: "+d1*d2*3.14);
	}
	public void clacArea(double p1, double p2) {
		System.out.println("Circle: calcArea(d1,d2)");
		System.out.println("¿øÀÇ ³ÐÀÌ: "+p1*p2*3.14);
	}
}
