package Math;

public class isPrime implements MathOperationInterface {

	public boolean doOperation(int n)
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
}
