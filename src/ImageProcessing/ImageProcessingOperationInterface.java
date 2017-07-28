package ImageProcessing;
import java.awt.image.BufferedImage;
import Snippet.*;

public interface ImageProcessingOperationInterface {

	public BufferedImage doOperation (Snippet.Signature signature, BufferedImage input);
	public BufferedImage doOperation (Snippet.Signature signature, BufferedImage input1, BufferedImage input2);
	public BufferedImage doOperation (Snippet.Signature signature, BufferedImage input, double value);
	public BufferedImage doOperation (Snippet.Signature signature, BufferedImage input, double val1, double val2);
}
