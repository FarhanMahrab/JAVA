import java.lang.*;

public class StaticBlock
{
	static{
		System.out.println("Hi I am");
	}
	static{
		System.out.print(" Sajid");
	}
	static{
		System.out.print(" and I teach java");
	}

	public static void main(String[] args)
	{
		StaticBlock sb = new StaticBlock();  //when object is created static blocks are called in order
		StaticBlock sb1 = new StaticBlock();
	}
}