package ImageProcessing;

import java.awt.Color;
import java.awt.image.BufferedImage;
import Snippet.*;

public class mergePhotos implements ImageProcessingOperationInterface {

	private mergePhotos(){};
	public mergePhotos(Snippet.Signature signature)
	{
		signature.hashCode();
	}
	
	//Image after operation
	private BufferedImage outputImg;

	@Override
	public BufferedImage doOperation(BufferedImage inputImg, BufferedImage inputImg2) {
		
		
		//get dimension of each photo first
		//set the output image dimensions to match the minimum height and the minimum width of the 2 photos
		//iterate over the two photos, get the rgb values of each one and add them together
		//cutoff if it's more than 255
		
		//range according to smaller dimensions
		int minHeight,minWidth;
		if(inputImg.getHeight()>inputImg2.getHeight())
			minHeight=inputImg2.getHeight();
		else
			minHeight=inputImg.getHeight();
		
		if(inputImg.getWidth()>inputImg2.getWidth())
			minWidth=inputImg2.getWidth();
		else
			minWidth=inputImg.getWidth();
		
		outputImg=new BufferedImage(minWidth, minHeight, BufferedImage.TYPE_INT_RGB);

		
		for (int i=0;i<minWidth;i++)
		{
			for (int j=0;j<minHeight;j++)
			{
				//extracting rgb values of a pixel
				Color pixel1=new Color(inputImg.getRGB(i, j));
				int r1=pixel1.getRed();
				int b1=pixel1.getBlue();
				int g1=pixel1.getGreen();
				int alpha1=pixel1.getAlpha();
				
				Color pixel2=new Color(inputImg2.getRGB(i, j));
				int r2=pixel2.getRed();
				int b2=pixel2.getBlue();
				int g2=pixel2.getGreen();
				int alpha2=pixel2.getAlpha();
				

				r1+=r2;
				if(r1>255)
				{r1=255;}
				
				
				
				g1+=g2;
				
				if(g1>255)
				{g1=255;}
				
				
				
				b1+=b2;
				
				if(b1>255)
				{b1=255;}
				
				
				
				//setting new colors
				Color newPixel= new Color(r1,g1,b1,alpha1);
				
				outputImg.setRGB(i, j, newPixel.getRGB());
				
			}
		}
		
	return outputImg;
	}
	
	@Override
	public BufferedImage doOperation(BufferedImage input) {
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
