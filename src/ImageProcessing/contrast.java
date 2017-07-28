package ImageProcessing;

import java.awt.Color;
import java.awt.image.BufferedImage;

import Snippet.Snippet;

public class contrast implements ImageProcessingOperationInterface {

	//Image after operation
	private BufferedImage outputImg;
	
	public BufferedImage doOperation(Snippet.Signature signature, BufferedImage inputImg, double newMin, double newMax)
	{
		signature.hashCode();
		outputImg=new BufferedImage(inputImg.getWidth(), inputImg.getHeight(), BufferedImage.TYPE_INT_RGB);
		
		//iterating over each pixel, get the minimum and maximum value to each color
		//iterate again, this time apply a function on each color using the retrieved min and max values 
		//corresponding to that color, along with the input new min and new max values.
		//cutoff if it's more than 255

		double diff=newMax-newMin;
		double oldminb=255,oldmaxb=0,oldminr=255,oldmaxr=0,oldming=255,oldmaxg=0;
		
		//getting old min and old max -error was assuming that old min=0 and oldmax= 255
		for (int i=0;i<inputImg.getWidth();i++)
		{
			for (int j=0;j<inputImg.getHeight();j++)
			{
				Color pixel=new Color(inputImg.getRGB(i, j));
				float r=pixel.getRed();
				float b=pixel.getBlue();
				float g=pixel.getGreen();
				float alpha=pixel.getAlpha();
				
				if(r>oldmaxr)
					oldmaxr=r;
				else if (r<oldminr)
					oldminr=r;
				
				if(g>oldmaxg)
					oldmaxg=g;
				else if (g<oldming)
					oldming=g;
				
				if(b>oldmaxb)
					oldmaxb=b;
				else if (b<oldminb)
					oldminb=b;
			}
		}
		
		for (int i=0;i<inputImg.getWidth();i++)
		{
			for (int j=0;j<inputImg.getHeight();j++)
			{
				//extracting rgb values of a pixel
				Color pixel=new Color(inputImg.getRGB(i, j));
				float r=pixel.getRed();
				float b=pixel.getBlue();
				float g=pixel.getGreen();
				float alpha=pixel.getAlpha();
				

				r-=oldminr;
				r/=(oldmaxr-oldminr);
				r*=diff;
				r+=newMin;
				
				if(r>255)
				{r=255;}
				else if(r<0)
				{r=0;}
				
				
				g-=oldming;
				g/=(oldmaxg-oldming);
				g*=diff;
				g+=newMin;
				
				if(g>255)
				{g=255;}
				else if(g<0)
				{g=0;}
				

				
				b-=oldminb;
				b/=(oldmaxb-oldminb);
				b*=diff;
				b+=newMin;
				
				if(b>255)
				{b=255;}
				else if(b<0)
				{b=0;}
				

				
				int ir=(int)r;
				int ig=(int)g;
				int ib=(int)b;
				int ialpha=(int)alpha;
				
				//setting new colors
				Color newPixel= new Color(ir,ig,ib,ialpha);
				
				outputImg.setRGB(i, j, newPixel.getRGB());
				
			}
		}
		
		return outputImg;
	}
	
	@Override
	public BufferedImage doOperation(Snippet.Signature signature, BufferedImage input) {
		// TODO Auto-generated method stub
		signature.hashCode();
		return input;
	}

	@Override
	public BufferedImage doOperation(Snippet.Signature signature, BufferedImage input, double value) {
		// TODO Auto-generated method stub
		signature.hashCode();
		return input;
	}

	@Override
	public BufferedImage doOperation(Snippet.Signature signature, BufferedImage input1, BufferedImage input2) {
		// TODO Auto-generated method stub
		signature.hashCode();
		return null;
	}

}
