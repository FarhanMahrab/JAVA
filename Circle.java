import java.lang.*;

public class Circle extends Shape
{
	public Circle()
	{
		System.out.println("Empty for Circle");
	}
    public Circle(double x)
	{
		super(x);
		System.out.println("parameterized for Circle");
	}
	public void setX()
	{
		this.x = x;
	}
	public double getx()
	{
		return x;
	}
	public double getArea()
	{
		return 3.1416*x*x;            // method overriding
	}
}