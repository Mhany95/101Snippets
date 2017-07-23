import Math.*;


//This is a wrapper class, it will be used to access all the other packages
//It hides the logic of each class by using the interface of each package
//It should be used in main

public class Snippet {

	private MathOperationInterface MathOp;
	
	public double add(double n1,double n2)
	{
		MathOp= new add();
		return MathOp.doOperation(n1, n2);
	}
	
	public double[] add(double[] n1, double[] n2)
	{
		MathOp= new add();
		return MathOp.doOperation(n1, n2);
	}
	public double sub(double n1,double n2)
	{
		MathOp= new sub();
		return MathOp.doOperation(n1, n2);
	}
	
	public double[] sub(double[] n1, double[] n2)
	{
		MathOp= new sub();
		return MathOp.doOperation(n1, n2);
	}
	
	public double div(double n1,double n2)
	{
		MathOp= new div();
		return MathOp.doOperation(n1, n2);
	}
	
	public double[] div(double[] n1, double[] n2)
	{
		MathOp= new div();
		return MathOp.doOperation(n1, n2);
	}
	
	public double multi(double n1,double n2)
	{
		MathOp= new multi();
		return MathOp.doOperation(n1, n2);
	}
	
	public double[] multi(double[] n1, double[] n2)
	{
		MathOp= new multi();
		return MathOp.doOperation(n1, n2);
	}
	
	public double factorial(double n1)
	{
		MathOp= new factorial();
		return MathOp.doOperation(n1);
	}
	
	public boolean isPrime(double n1)
	{
		MathOp= new isPrime();
		return MathOp.doCheckOperation(n1);
	}
	
	public double fibonacci (double n1)
	{
		MathOp= new fibonacci();
		return MathOp.doOperation(n1);
	}
}
