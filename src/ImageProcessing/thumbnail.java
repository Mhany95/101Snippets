package ImageProcessing;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import Snippet.*;

public class thumbnail implements ImageProcessingOperationInterface {

	private thumbnail(){};
	public thumbnail(Snippet.Signature signature)
	{
		signature.hashCode();
	}
	
	//Image after operation
	private BufferedImage outputImg;
	
	@Override
	public BufferedImage doOperation(BufferedImage inputImg, double val1, double val2) {
		
		//getscaledinstance takes scales the input image with the new entered dimensions
		//the last parameter takes a value that represents the type of algorithm to be used in scalling,
		//I chose "Scale smooth" to smoothly scale the image, which might take some extra time
		//the output of the operation is an image of type "Image", which can't be converted to "BufferedImage"
		
		Image tmpImg= inputImg.getScaledInstance((int)val1, (int)val2, Image.SCALE_SMOOTH);
		outputImg=new BufferedImage(tmpImg.getWidth(null), tmpImg.getHeight(null), BufferedImage.TYPE_INT_RGB);
		
		//graphics class is used to fill the empty "outputImg" with the newly scaled image of type "Image"
		Graphics g = outputImg.getGraphics();
		g.drawImage(tmpImg, 0, 0, null);
		g.dispose();
		
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
