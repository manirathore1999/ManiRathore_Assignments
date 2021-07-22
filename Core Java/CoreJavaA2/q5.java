package CoreJavaA2;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape=new Line();
		shape.draw();
		
		Shape shape1=new Rectangle();
		shape1.draw();
		
		Shape shape2=new Cube();
		shape2.draw();

	}

}

abstract class Shape {

	public Shape() {
		// TODO Auto-generated constructor stub
	}
	abstract void draw();

}
class Line extends Shape{

	@Override
	void draw() {
		System.out.println("Drawing a line");
	}
	
}
class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("Drawing a rectangle");
	}
	
}
class Cube extends Shape{

	@Override
	void draw() {
		System.out.println("Drawing a cube");
	}
	
}
