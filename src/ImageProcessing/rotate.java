package ImageProcessing;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import Snippet.*;

public class rotate implements ImageProcessingOperationInterface {

	private rotate(){};
	public rotate(Snippet.Signature signature)
	{
		signature.hashCode();
	}

	//Image after operation
	private BufferedImage outputImg;
	
	@Override
	public BufferedImage doOperation(BufferedImage inputImg) {
		
		double radianValue = 1.5707963267948966;  //This is the radian value of 90 degree angle

		outputImg=new BufferedImage(inputImg.getHeight(), inputImg.getWidth(), BufferedImage.TYPE_INT_RGB); //old height is the new width and vice versa

        Graphics2D g = outputImg.createGraphics();
        AffineTransform at = new AffineTransform(); //This is used to create transformation
        
        at.translate((inputImg.getHeight() - inputImg.getWidth())/2, (inputImg.getWidth() - inputImg.getHeight())/2);  //first parameter is for width, second parameter is for height
        at.rotate(radianValue, inputImg.getWidth()/2, inputImg.getHeight()/2);
        g.setTransform(at);
        g.drawImage(inputImg, 0, 0, null);
        g.dispose();
        
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
