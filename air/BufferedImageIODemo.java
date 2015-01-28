import javax.imageio.*;
import java.io.*;
import java.awt.image.BufferedImage;

class BufferedImageIODemo{
public static void main(String[] args){
BufferedImage bi = null;
try{
bi = ImageIO.read(new File("a fortiory"));
File outputfile = new File("a fortiory.png");
ImageIO.write(bi,"png",outputfile);
}catch(IOException e){
System.out.println(e.toString());
}//end try-catch
}//end main
}//end class BufferedImageIODemo