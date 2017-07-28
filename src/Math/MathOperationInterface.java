package Math;

import Snippet.Snippet;

public interface MathOperationInterface {

	//for operations involving one number
	public double doOperation (Snippet.Signature signature, double n1);
	
	//for operations involving two numbers
	public double doOperation(Snippet.Signature signature, double n1,double n2);
	
	//for operations involving arrays
	public double[] doOperation(Snippet.Signature signature, double[] n1, double[] n2);
	
	//for operations requiring validation
	public boolean doCheckOperation (Snippet.Signature signature, double n1);
	

}
