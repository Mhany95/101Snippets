package Math;

public class fibonacci implements MathOperationInterface {

	@Override
	public double doOperation(double n1) {

		if (n1==0)
			return 0;
		else if (n1==1)
			return 1;
		else 
			return doOperation(n1-1)+ doOperation (n1-2);
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
