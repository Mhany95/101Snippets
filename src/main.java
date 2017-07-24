import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class main {
	public static void main(String[] args)
	{
		Snippet s= new Snippet();
		System.out.println(s.fibonacci(7));
		File imgFile= new File("D://c.bmp");
		BufferedImage img;
		try {
			ImageIO.write(s.gamma(ImageIO.read(imgFile),.5),"jpg",new File("t.jpg"));
			System.out.println("done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
