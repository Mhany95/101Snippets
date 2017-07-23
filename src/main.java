import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class main {
	public static void main(String[] args)
	{
		Snippet s= new Snippet();
		System.out.println(s.fibonacci(7));
		File imgFile= new File("test.jpg");
		BufferedImage img;
		try {
			ImageIO.write(s.changeBrightness(ImageIO.read(imgFile),50),"jpg",new File("t.jpg"));
			System.out.println("done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
