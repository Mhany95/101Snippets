package Snippet;
import java.awt.image.BufferedImage;

import Math.*;
import ImageProcessing.*;

//This is a wrapper class, it will be used to access all the other packages
//It hides the logic of each class by using the interface of each package
//It should be used in main

public class Snippet {

	//Nested "Signature" class will enforce the use of "Snippet" instead of using
	//the other classes directly
	
	public class Signature {
		
		private Signature()
		{} 
		}
	
    private Signature signature;
	private MathOperationInterface MathOp;
	private ImageProcessingOperationInterface ImgOp;
	
	
	//------------------Math Operations----------------------
	public double add(double n1,double n2)
	{
		signature= new Signature();
		MathOp= new add();
		return MathOp.doOperation(signature,n1, n2);
	}
	
	public double[] add(double[] n1, double[] n2)
	{
		signature= new Signature();
		MathOp= new add();
		return MathOp.doOperation(signature,n1, n2);
	}
	public double sub(double n1,double n2)
	{
		signature= new Signature();
		MathOp= new sub();
		return MathOp.doOperation(signature,n1, n2);
	}
	
	public double[] sub(double[] n1, double[] n2)
	{
		signature= new Signature();
		MathOp= new sub();
		return MathOp.doOperation(signature,n1, n2);
	}
	
	public double div(double n1,double n2)
	{
		signature= new Signature();
		MathOp= new div();
		return MathOp.doOperation(signature,n1, n2);
	}
	
	public double[] div(double[] n1, double[] n2)
	{
		signature= new Signature();
		MathOp= new div();
		return MathOp.doOperation(signature,n1, n2);
	}
	
	public double multi(double n1,double n2)
	{
		signature= new Signature();
		MathOp= new multi();
		return MathOp.doOperation(signature,n1, n2);
	}
	
	public double[] multi(double[] n1, double[] n2)
	{
		signature= new Signature();
		MathOp= new multi();
		return MathOp.doOperation(signature,n1, n2);
	}
	
	public double factorial(double n1)
	{
		signature= new Signature();
		MathOp= new factorial();
		return MathOp.doOperation(signature,n1);
	}
	
	public boolean isPrime(double n1)
	{
		signature= new Signature();
		MathOp= new isPrime();
		return MathOp.doCheckOperation(signature,n1);
	}
	
	public double fibonacci (double n1)
	{
		signature= new Signature();
		MathOp= new fibonacci();
		return MathOp.doOperation(signature,n1);
	}
	
	
	//-----------------Image Operations-------------------
	
	public BufferedImage changeBrightness(BufferedImage input, int value)
	{
		signature= new Signature();
		ImgOp= new brightness();
		return ImgOp.doOperation(signature,input, value);
	}
	
	public BufferedImage grayscale(BufferedImage input)
	{
		signature= new Signature();
		ImgOp= new grayscale();
		return ImgOp.doOperation(signature,input);
	}
	
	public BufferedImage gamma(BufferedImage input, double value)
	{
		if(value<0)
		{
			System.err.println("Input value should be positive, returning original image.");
			return input;
		}
		signature=new Signature();
		ImgOp=new gamma();
		return ImgOp.doOperation(signature,input, value);
	}
	
	public BufferedImage threshold(BufferedImage input, int value)
	{
		if(value<0)
		{
			System.err.println("Input value should be positive, returning original image.");
			return input;
		}
		signature= new Signature();
		ImgOp=new threshold();
		return ImgOp.doOperation(signature,input, value);
	}
	
	public BufferedImage contrast(BufferedImage input, int newMin, int newMax)
	{
		if(newMin<0 ||newMax<0)
		{
			System.err.println("Input value(s) should be positive, returning original image.");
			return input;
		}
		signature= new Signature();
		ImgOp=new contrast();
		return ImgOp.doOperation(signature,input, newMin, newMax);
	}
	
	public BufferedImage mergePhotos(BufferedImage input1,BufferedImage input2)
	{
		signature= new Signature();
		ImgOp=new mergePhotos();
		return ImgOp.doOperation(signature,input1, input2);
	}
}
