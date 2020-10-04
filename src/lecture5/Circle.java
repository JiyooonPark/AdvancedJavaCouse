package lecture5;

public class Circle extends Shape{
	private double radius;
	Circle(double radius){
		this.radius=radius;
		name="circle";
	}

	@Override
	public void draw() {
		System.out.println("circle");
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return radius*radius*Math.PI;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*radius*Math.PI;
	}

	@Override
	void showInfo() {
		System.out.println("Shape : "+ name +"\nradius: "+radius+"\nArea: "+getArea());
	}
}
