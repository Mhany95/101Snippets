package Math;

import Snippet.Snippet;

public class fibonacci implements MathOperationInterface {

	@Override
	public double doOperation(Snippet.Signature signature, double n1)
	{
		signature.hashCode();
		
		if (n1==0)
			return 0;
		else if (n1==1)
			return 1;
		else 
			return doOperation(signature,n1-1)+ doOperation (signature,n1-2);
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
