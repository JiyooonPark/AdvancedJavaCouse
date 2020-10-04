package lecture5;

public abstract class Shape {
	protected String name;
	String getName() {
		return name;
	}
	public abstract void draw();
	abstract double getArea();
	abstract double getPerimeter();
	abstract void showInfo();
}
