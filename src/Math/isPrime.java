package Math;

import Snippet.Snippet;

public class isPrime implements MathOperationInterface {

	public boolean doCheckOperation(Snippet.Signature signature, double n)
	{
		signature.hashCode();
		//Checking number isn't prime
		if((n!=2) && (n!=3)&& (n!=5) && (n!=7) && (n!=11) && (n!=13))
		{
		if((n%2==0)|| (n%3==0)|| (n%5==0)|| (n%7==0)|| (n%11==0)||(n%13==0)) //dividing by primes
		{
			return false; //not prime as it's divisible
		}
		}
		return true; //prime
	}

	@Override
	public double doOperation(Snippet.Signature signature, double n1) {
		// TODO Auto-generated method stub
		signature.hashCode();
		System.out.println("Invalid method.");
		return 0;
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

}
