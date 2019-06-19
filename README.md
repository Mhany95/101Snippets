# 101Snippets
This small Java project aims to collect multiple snippets that a developer might need and put it in one place.
Using a couple of design patterns, this project should be easy to use and to extend if needed/ wanted, simply use any interface and then create separate classes that would implement it, then add it to the **Snippet** Class.


Snippets are covering some basic mathematical operations like:
- Addition
- Subtraction
- Multiplication
- Divison 
- Factorial
- Fibbonacci 
- Prime Numbers

You can also use this to do some basic image processing operations, currently these are the available ones:
- Brigthness
- Contrast
- Gamma filter
- Mean
- Thumbnail
- Negative
- Threshold
- Rotate
- Merging Photos
- Blue filter
- Green filter
- Red filter
- Sepia
- Grayscale

To use **101Snippets**, simply import it to your class:
```Java
import Snippet.Snippet;
```

Then create an instance:
```Java
Snippet mySnippet = new Snippet();
```

Start using all the functions that you would want!
Here's a full example for creating a *thumbnail* of an image:

```Java
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import Snippet.Snippet;


public class main{
  public static void main(String[] args){
  
    Snippet mySnippet = new Snippet();
    File myFile= new File("D://myLargeImage.jpg"); //a large image file
    
    try {
      BufferedImage myLargeImg = ImageIO.read(imgFile); // to read the file into a buffered image
      
      BufferedImage myThumbnail = mySnippet.createThumbnail(myLargeImg, 60,100); //using 101Snippets to create a thumbnail, first parameter takes a buffered image, second takes the width and the last one is for height
      
      ImageIO.write(myThumbnail,"jpg",new File("D://thumbnail.jpg")); //saving the generated thumbnail
    }
    catch (IOException e) {
      e.printStackTrace();
    }
   }
  }
```
