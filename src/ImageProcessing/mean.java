package ImageProcessing;

import java.awt.Color;
import java.awt.image.BufferedImage;

import Snippet.*;

public class mean implements ImageProcessingOperationInterface {

	private mean(){};
	public mean(Snippet.Signature signature)
	{
		signature.hashCode();
	}
	
	//Image after operation
	private BufferedImage outputImg;
		
	@Override
	public BufferedImage doOperation(BufferedImage inputImg, double filterWidth, double filterHeight) {
		
		outputImg=new BufferedImage(inputImg.getWidth(), inputImg.getHeight(), BufferedImage.TYPE_INT_RGB);
		
		//iterating over each pixel, extract the rgb and alpha values
		//add the value, the higher the added value the more bright it will be
		//cutoff if it's more than 255 and make it 0 if it's negative
		
		for (int x=0;x<inputImg.getWidth()-filterWidth+1;x++)
		{
			for (int y=0;y<inputImg.getHeight()-filterHeight+1;y++)
			{
				
				int redValues=0;
				int greenValues=0;
				int blueValues=0;
				int alphaValues=0;
				//System.out.println("values: "+x+" "+y);
				for(int i=0;i<filterWidth;i++)
				{
					for(int j=0;j<filterHeight;j++)
					{
						Color pixel=new Color(inputImg.getRGB(i+x, j+y));
						redValues+=pixel.getRed();
						greenValues+=pixel.getGreen();
						blueValues+=pixel.getBlue();
						alphaValues+=pixel.getAlpha();
					}
				}
				redValues/=(int)(filterHeight*filterWidth);
				greenValues/=(int)(filterHeight*filterWidth);
				blueValues/=(int)(filterHeight*filterWidth);
				alphaValues/=(int)(filterHeight*filterWidth);

				Color newPixel=new Color(redValues,greenValues,blueValues,alphaValues);
				outputImg.setRGB(x, y, newPixel.getRGB());
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
	public BufferedImage doOperation(BufferedImage input1, BufferedImage input2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BufferedImage doOperation(BufferedImage input, double value) {
		// TODO Auto-generated method stub
		return null;
	}


}
