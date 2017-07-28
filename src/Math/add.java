package Math;

import java.awt.List;

import Snippet.Snippet;

public class add implements MathOperationInterface {

	//numbers
	public double doOperation(Snippet.Signature signature, double n1, double n2)
	{
		signature.hashCode();
		return n1+n2;
	}
	
	
	//arrays
	public double[] doOperation(Snippet.Signature signature, double[] n1, double[] n2)
	{
		signature.hashCode();
		//get length of both arrays
		int l1= n1.length;
		int l2= n2.length;
		double[] n3;
		//iterate on the smaller list
		if (l1<l2)
		{
			n3=n2; //setting its size to the larger array
			for(int i=0;i<l1;i++)
			{
				n3[i]=n1[i]+n2[i];
			}
			for(int i=l1;i<l2;i++)
			{
				n3[i]=n2[i];
			}
		}
		else
		{
			n3=n1; //setting its size to the larger array
			for(int i=0;i<l2;i++)
			{
				n3[i]=n1[i]+n2[i];
			}
			for(int i=l2;i<l1;i++)
			{
				n3[i]=n1[i];
			}
		}
		
		return n3;
	}


	@Override
	public double doOperation(Snippet.Signature signature, double n1) {
		// TODO Auto-generated method stub
		signature.hashCode();
		return n1;
	}


	@Override
	public boolean doCheckOperation(Snippet.Signature signature, double n1) {
		// TODO Auto-generated method stub
		signature.hashCode();
		System.out.println("Invalid method.");
		return false;
	}




}
