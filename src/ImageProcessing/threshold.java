package ImageProcessing;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class threshold implements ImageProcessingOperationInterface {

	//Image after operation
	private BufferedImage outputImg;
		
	@Override
	public BufferedImage doOperation(BufferedImage inputImg, double threshold) {
		outputImg=new BufferedImage(inputImg.getWidth(), inputImg.getHeight(), BufferedImage.TYPE_INT_RGB);
		
		//iterating over each pixel, extract the rgb and alpha values
		//compare value of extracted colors and the input threshold
		//set to 255 if higher than threshold, otherwise set to 0
		//set the new values
				
		for (int i=0;i<inputImg.getWidth();i++)
		{
			for (int j=0;j<inputImg.getHeight();j++)
			{
				//extracting the rgb values of a pixel
				Color pixel=new Color(inputImg.getRGB(i, j));
				int r=pixel.getRed();
				int b=pixel.getBlue();
				int g=pixel.getGreen();
				int alpha=pixel.getAlpha();
				
				if(r>threshold)
				{r=255;}
				else r=0;
				
				if(g>threshold)
				{g=255;}
				else g=0;
				
				if(b>threshold)
				{b=255;}
				else b=0;
				
				if(alpha>threshold)
				{alpha=255;}
				else alpha=0;
				
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

}
