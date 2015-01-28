// this program is intended for converting B_Dictionary images to png format

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.util.Scanner;

class ImageConvertUtility{
public static void main(String[] args) throws Exception{
BufferedImage bi = null;
File inputFile,outputFile,f;
String inputDirName,outputDirName,fileName;
String[] dirList,fileList;
Scanner inp = new Scanner(System.in);

if(args.length == 1)
inputDirName = args[0];
else
inputDirName = "/";

System.out.print("Give an output directory: ");
outputDirName = inp.next();

System.out.println("Processing...");
long initTime = System.currentTimeMillis();

f = new File(inputDirName);

if(!f.isDirectory()){
System.out.println(inputDirName+" is not a directory!");
}else{

dirList = f.list();

for(int i=0;i<dirList.length;i++){
//System.out.println(dirList[i]);
f = new File(inputDirName+"/"+dirList[i]);

if(f.isDirectory()){
fileList = f.list();
for(int j=0;j<fileList.length;j++){

fileName = fileList[j];

if(fileName.contains(" ") || fileName.contains("-"))
fileName = fileName.replaceAll("[ -]","_");

outputFile = new File(outputDirName+"/"+fileName+".png");

try{
bi = ImageIO.read(new File(f+"/"+fileList[j]));
//File outputfile = new File("a fortiory.png");
ImageIO.write(bi,"png",outputFile);
}catch(IOException e){
System.out.println(e.toString());
}//end try-catch

}//end for
}//end if

}//end for

}//end if-else

int elapsedTime = (int)(System.currentTimeMillis()-initTime)/1000;
System.out.print("Time Elapsed: "+(elapsedTime/(24*60))+"hr ");
int min = elapsedTime%(24*60);
System.out.print((min/60)+"min ");
int sec = min%60;
System.out.println(sec+"sec.");
}//end main
}//end class ImageConvertUtility