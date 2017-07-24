package ImageProcessing;
import java.awt.image.BufferedImage;

public interface ImageProcessingOperationInterface {

	public BufferedImage doOperation (BufferedImage input);
	public BufferedImage doOperation(BufferedImage input, double value);
	public BufferedImage doOperation(BufferedImage input, double val1, double val2);
}
