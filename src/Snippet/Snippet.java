package Snippet;
import java.awt.image.BufferedImage;

import Math.*;
import ImageProcessing.*;

//This is a wrapper class, it will be used to access all the other packages
//It hides the logic of each class by using the interface of each package
//It should be used in main

public class Snippet {

	private MathOperationInterface MathOp;
	private ImageProcessingOperationInterface ImgOp;
	
	
	//------------------Math Operations----------------------
	public double add(double n1,double n2)
	{
		MathOp= new add();
		return MathOp.doOperation(n1, n2);
	}
	
	public double[] add(double[] n1, double[] n2)
	{
		MathOp= new add();
		return MathOp.doOperation(n1, n2);
	}
	public double sub(double n1,double n2)
	{
		MathOp= new sub();
		return MathOp.doOperation(n1, n2);
	}
	
	public double[] sub(double[] n1, double[] n2)
	{
		MathOp= new sub();
		return MathOp.doOperation(n1, n2);
	}
	
	public double div(double n1,double n2)
	{
		MathOp= new div();
		return MathOp.doOperation(n1, n2);
	}
	
	public double[] div(double[] n1, double[] n2)
	{
		MathOp= new div();
		return MathOp.doOperation(n1, n2);
	}
	
	public double multi(double n1,double n2)
	{
		MathOp= new multi();
		return MathOp.doOperation(n1, n2);
	}
	
	public double[] multi(double[] n1, double[] n2)
	{
		MathOp= new multi();
		return MathOp.doOperation(n1, n2);
	}
	
	public double factorial(double n1)
	{
		MathOp= new factorial();
		return MathOp.doOperation(n1);
	}
	
	public boolean isPrime(double n1)
	{
		MathOp= new isPrime();
		return MathOp.doCheckOperation(n1);
	}
	
	public double fibonacci (double n1)
	{
		MathOp= new fibonacci();
		return MathOp.doOperation(n1);
	}
	
	
	//-----------------Image Operations-------------------
	
	public BufferedImage changeBrightness(BufferedImage input, int value)
	{
		ImgOp= new brightness();
		return ImgOp.doOperation(input, value);
	}
	
	public BufferedImage grayscale(BufferedImage input)
	{
		ImgOp= new grayscale();
		return ImgOp.doOperation(input);
	}
	
	public BufferedImage gamma(BufferedImage input, double value)
	{
		if(value<0)
		{
			System.err.println("Input value should be positive, returning original image.");
			return input;
		}
		ImgOp=new gamma();
		return ImgOp.doOperation(input, value);
	}
	
	public BufferedImage threshold(BufferedImage input, int value)
	{
		if(value<0)
		{
			System.err.println("Input value should be positive, returning original image.");
			return input;
		}
		ImgOp=new threshold();
		return ImgOp.doOperation(input, value);
	}
	
	public BufferedImage contrast(BufferedImage input, int newMin, int newMax)
	{
		if(newMin<0 ||newMax<0)
		{
			System.err.println("Input value(s) should be positive, returning original image.");
			return input;
		}
		ImgOp=new contrast();
		return ImgOp.doOperation(input, newMin, newMax);
	}
	
	public BufferedImage mergePhotos(BufferedImage input1,BufferedImage input2)
	{
		ImgOp=new mergePhotos();
		return ImgOp.doOperation(input1, input2);
	}
}