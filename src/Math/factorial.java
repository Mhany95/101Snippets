package Math;

public class factorial implements MathOperationInterface {

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
}
