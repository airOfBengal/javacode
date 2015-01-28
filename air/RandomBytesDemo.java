import java.util.Random;

class RandomBytesDemo{
public static void main(String args[]){
Random r = new Random();
byte[] rands = new byte[52];
r.nextBytes(rands);
for(int i=0;i<rands.length;i++)
System.out.print(rands[i]+" ");
System.out.println();
}
}//end class