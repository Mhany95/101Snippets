package ImageProcessing;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class brightness implements ImageProcessingOperationInterface {

	//Image after operation
	private BufferedImage outputImg;
	@Override
	
	public BufferedImage doOperation(BufferedImage inputImg, int value) {
		
		outputImg=new BufferedImage(inputImg.getWidth(), inputImg.getHeight(), BufferedImage.TYPE_INT_RGB);
		
		//iterating over each pixel, extract the rgb and alpha values
		//add the value, the higher the added value the more bright it will be
		//cutoff if it's more than 255
		
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
				
				g+=value;
				
				if(g>255)
				{g=255;}
				
				b+=value;
				
				if(b>255)
				{b=255;}
				
				//setting new colors
				Color newPixel= new Color(r,g,b,alpha);
				
				outputImg.setRGB(i, j, newPixel.getRGB());
				
			}
		}
		return outputImg;
	}

	
}
