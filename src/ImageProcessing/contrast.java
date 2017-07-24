package ImageProcessing;

import java.awt.image.BufferedImage;

public class contrast implements ImageProcessingOperationInterface {

	public void doOperation(String imgPath, float newMin, float newMax)
	{
		float diff=newMax-newMin;
		float oldminb=255,oldmaxb=0,oldminr=255,oldmaxr=0,oldming=255,oldmaxg=0;
		
		//getting old min and old max -error was assuming that old min=0 and oldmax= 255
		for (int i=0;i<img.getWidth();i++)
		{
			for (int j=0;j<img.getHeight();j++)
			{
				Color pixel=new Color(img.getRGB(i, j));
				float r=pixel.getRed();
				float b=pixel.getBlue();
				float g=pixel.getGreen();
				float alpha=pixel.getAlpha();
				
				if(r>oldmaxr)
					oldmaxr=r;
				else if (r<oldminr)
					oldminr=r;
				
				if(g>oldmaxg)
					oldmaxg=g;
				else if (g<oldming)
					oldming=g;
				
				if(b>oldmaxb)
					oldmaxb=b;
				else if (b<oldminb)
					oldminb=b;
			}
		}
		
		for (int i=0;i<img.getWidth();i++)
		{
			for (int j=0;j<img.getHeight();j++)
			{
				//extracting rgb values of a pixel
				Color pixel=new Color(img.getRGB(i, j));
				float r=pixel.getRed();
				float b=pixel.getBlue();
				float g=pixel.getGreen();
				float alpha=pixel.getAlpha();
				

				r-=oldminr;
				r/=(oldmaxr-oldminr);
				r*=diff;
				r+=newMin;
				
				if(r>255)
				{r=255;}
				else if(r<0)
				{r=0;}
				
				
				g-=oldming;
				g/=(oldmaxg-oldming);
				g*=diff;
				g+=newMin;
				
				if(g>255)
				{g=255;}
				else if(g<0)
				{g=0;}
				

				
				b-=oldminb;
				b/=(oldmaxb-oldminb);
				b*=diff;
				b+=newMin;
				
				if(b>255)
				{b=255;}
				else if(b<0)
				{b=0;}
				

				
				int ir=(int)r;
				int ig=(int)g;
				int ib=(int)b;
				int ialpha=(int)alpha;
				
				//setting new colors
				Color newPixel= new Color(ir,ig,ib,ialpha);
				
				img.setRGB(i, j, newPixel.getRGB());
				
			}
		}
		
		System.out.println("ops done");
	
	}
	
	@Override
	public BufferedImage doOperation(BufferedImage input) {
		// TODO Auto-generated method stub
		return input;
	}

	@Override
	public BufferedImage doOperation(BufferedImage input, double value) {
		// TODO Auto-generated method stub
		return input;
	}

}
