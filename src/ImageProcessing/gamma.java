package ImageProcessing;

import java.awt.Color;
import java.awt.image.BufferedImage;

import Snippet.Snippet;

public class gamma implements ImageProcessingOperationInterface {

	//Image after operation
	private BufferedImage outputImg;
	
	@Override
	public BufferedImage doOperation(Snippet.Signature signature, BufferedImage inputImg, double gammaValue) {
		
			signature.hashCode();
			outputImg=new BufferedImage(inputImg.getWidth(), inputImg.getHeight(), BufferedImage.TYPE_INT_RGB);
			
			//get inverse of the input gamma value
			//iterating over each pixel, extract the rgb and alpha values
			//apply a mathematical function to each color separately
			//set the new values
			
			gammaValue=1/gammaValue;
			
			for (int i=0;i<inputImg.getWidth();i++)
			{
				for (int j=0;j<inputImg.getHeight();j++)
				{
					//extracting the rgb values of a pixel
					Color pixel=new Color(inputImg.getRGB(i, j));
					double r=pixel.getRed();
					double b=pixel.getBlue();
					double g=pixel.getGreen();
					double alpha=pixel.getAlpha();
					
					r=(int)255*(Math.pow((double)r/(double)255, gammaValue));
					g=(int)255*(Math.pow((double)g/(double)255, gammaValue));
					b=(int)255*(Math.pow((double)b/(double)255, gammaValue));
					
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
	public BufferedImage doOperation(Snippet.Signature signature, BufferedImage input, double val1, double val2) {
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
