import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Snippet.Snippet;


public class main {
	public static void main(String[] args)
	{
		Snippet s= new Snippet();
		File imgFile= new File("D://e.jpg");
		File imgFile2= new File("D://t.jpg");

		BufferedImage img;
		try {
			ImageIO.write(s.meanFilter(ImageIO.read(imgFile2),3,3),"jpg",new File("tuuut.jpg"));
			System.out.println("done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
