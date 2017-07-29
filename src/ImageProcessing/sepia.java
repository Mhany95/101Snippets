package ImageProcessing;

import java.awt.Color;
import java.awt.image.BufferedImage;

import Snippet.*;

public class sepia implements ImageProcessingOperationInterface {

	private sepia(){};
	public sepia(Snippet.Signature signature)
	{
		signature.hashCode();
	}
	
	//Image after operation
	private BufferedImage outputImg;
	
	@Override
	public BufferedImage doOperation(BufferedImage inputImg) {
		
		outputImg=new BufferedImage(inputImg.getWidth(), inputImg.getHeight(), BufferedImage.TYPE_INT_RGB);
		
		//iterating over each pixel, extract the rgb and alpha values
		//apply below equations for each color
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
				
				int tr=(int)(0.393*r + 0.769*g + 0.189*b);
                int tg=(int)(0.349*r + 0.686*g + 0.168*b);
                int tb=(int)(0.272*r + 0.534*g + 0.131*b);

                if(tr>255)
                {tr=255;}
                
                if(tg>255)
                {tg=255;}
                
                if(tb>255)
                {tb=255;}
				
				//setting new colors
				Color newPixel= new Color(tr,tg,tb,alpha);
				
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
