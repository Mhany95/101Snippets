package ImageProcessing;

import java.awt.Color;
import java.awt.image.BufferedImage;

import Snippet.*;

public class blue implements ImageProcessingOperationInterface {

	private blue(){};
	public blue(Snippet.Signature signature)
	{
		signature.hashCode();
	}
	
	//Image after operation
	private BufferedImage outputImg;
		
	@Override
	public BufferedImage doOperation(BufferedImage inputImg) {
	
		outputImg=new BufferedImage(inputImg.getWidth(), inputImg.getHeight(), BufferedImage.TYPE_INT_RGB);
		
		//iterating over each pixel, extract the rgb and alpha values
		//set the r and g values to zero
		//save the new values
		
		for (int i=0;i<inputImg.getWidth();i++)
		{
			for (int j=0;j<inputImg.getHeight();j++)
			{
				//extracting rgb values of a pixel
				Color pixel=new Color(inputImg.getRGB(i, j));
				int r=pixel.getRed();
				int b=pixel.getBlue();
				int g=pixel.getGreen();
				int alpha=pixel.getAlpha();
								
				r=0;
				g=0;
				
				//setting new colors
				Color newPixel= new Color(r,g,b,alpha);
				
				outputImg.setRGB(i, j, newPixel.getRGB());
				
			}
		}
		return outputImg;
	}

	@Override
	public BufferedImage doOperation(BufferedImage input1, BufferedImage input2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BufferedImage doOperation(BufferedImage input, double value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BufferedImage doOperation(BufferedImage input, double val1,
			double val2) {
		// TODO Auto-generated method stub
		return null;
	}

}
