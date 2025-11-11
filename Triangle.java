import java.lang.*;

public class Triangle extends Shape
{
	double y; //default. Accessible within the same package and subclasses

	public Triangle()
	{
		System.out.println("Empty for Triangle");
	}
    public Triangle(double x, double y)
	{
		super(x);                  // parameterized constructor of parent class called
		this.y = y;
		System.out.println("parameterized for Triangle");
	}
	public void setY(double y)
	{
		this.y =y;
	}
	public double getY()
	{
		return y;
	}
	public void setX(double x)
	{
		this.x=x;
	}
	public double getArea()
	{
		return 0.5*x*y;            // method overriding
	}
}