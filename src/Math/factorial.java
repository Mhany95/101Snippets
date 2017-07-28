package Math;

import Snippet.Snippet;

public class factorial implements MathOperationInterface {

	public double doOperation(Snippet.Signature signature, double n)
	{
		signature.hashCode();
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
	public double doOperation(Snippet.Signature signature, double n1, double n2) {
		// TODO Auto-generated method stub
		signature.hashCode();
		System.out.println("Invalid number of arguments.");
		return 0;
	}

	@Override
	public double[] doOperation(Snippet.Signature signature, double[] n1, double[] n2) {
		// TODO Auto-generated method stub
		signature.hashCode();
		System.out.println("Invalid number of arguments.");
		return null;
	}

	@Override
	public boolean doCheckOperation(Snippet.Signature signature, double n1) {
		// TODO Auto-generated method stub
		signature.hashCode();
		System.out.println("Invalid method.");
		return false;
	}
}
