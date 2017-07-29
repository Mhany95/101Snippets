package ImageProcessing;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class brightness implements ImageProcessingOperationInterface {

	//Image after operation
	private BufferedImage outputImg;
	
	@Override
	public BufferedImage doOperation(BufferedImage inputImg, double value) {
		
		outputImg=new BufferedImage(inputImg.getWidth(), inputImg.getHeight(), BufferedImage.TYPE_INT_RGB);
		
		//iterating over each pixel, extract the rgb and alpha values
		//add the value, the higher the added value the more bright it will be
		//cutoff if it's more than 255 and make it 0 if it's negative
		
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
				
				r+=value;
				
				if(r>255)
				{r=255;}
				else if (r<0)
				{r=0;}
				
				g+=value;
				
				if(g>255)
				{g=255;}
				else if (g<0)
				{g=0;}
				
				b+=value;
				
				if(b>255)
				{b=255;}
				else if (b<0)
				{b=0;}
				
				//setting new colors
				Color newPixel= new Color(r,g,b,alpha);
				
				outputImg.setRGB(i, j, newPixel.getRGB());
				
			}
		}
		return outputImg;
	}
	
	@Override
	public BufferedImage doOperation(BufferedImage input) {
		// TODO Auto-generated method stub
		return input;
	}

	@Override
	public BufferedImage doOperation(BufferedImage input, double val1, double val2) {
		// TODO Auto-generated method stub
		return input;
	}

	@Override
	public BufferedImage doOperation(BufferedImage input1, BufferedImage input2) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
