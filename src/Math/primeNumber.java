package Math;
import Snippet.*;

public class primeNumber implements MathOperationInterface {

	private primeNumber(){};
	public primeNumber(Snippet.Signature signature)
	{
		signature.hashCode();
	}
	
	public boolean doCheckOperation(double n)
	{
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
	public double doOperation(double n1) {
		// TODO Auto-generated method stub
		System.out.println("Invalid method.");
		return 0;
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

}
