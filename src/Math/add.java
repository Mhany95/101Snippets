package Math;

import java.awt.List;
import Snippet.*;

public class add implements MathOperationInterface {

	private add(){};
	public add(Snippet.Signature signature)
	{
		signature.hashCode();
	}
	
	//numbers
	public double doOperation(double n1, double n2)
	{
		return n1+n2;
	}
	
	
	//arrays
	public double[] doOperation(double[] n1, double[] n2)
	{
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
	public double doOperation(double n1) {
		// TODO Auto-generated method stub
		return n1;
	}


	@Override
	public boolean doCheckOperation(double n1) {
		// TODO Auto-generated method stub
		System.out.println("Invalid method.");
		return false;
	}




}
