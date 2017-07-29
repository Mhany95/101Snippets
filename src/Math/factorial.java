package Math;
import Snippet.*;

public class factorial implements MathOperationInterface {

	private factorial(){};
	public factorial(Snippet.Signature signature)
	{
		signature.hashCode();
	}
	
	public double doOperation(double n)
	{
		double res=1;

		if(n!=0)
		{
		for (double i=n;i>0;i--)
		{
			res=res*i;
		}
		}
		else
		{
			res=0;
		}
		return res;
	}

	@Override
	public double doOperation(double n1, double n2) {
		// TODO Auto-generated method stub
		System.out.println("Invalid number of arguments.");
		return 0;
	}

	@Override
	public double[] doOperation(double[] n1, double[] n2) {
		// TODO Auto-generated method stub
		System.out.println("Invalid number of arguments.");
		return null;
	}

	@Override
	public boolean doCheckOperation(double n1) {
		// TODO Auto-generated method stub
		System.out.println("Invalid method.");
		return false;
	}
}
