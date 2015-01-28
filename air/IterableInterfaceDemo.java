import java.util.Scanner;

public class IterableInterfaceDemo{
public static void main(String[] args){
Scanner inp = new Scanner(System.in);
int n;
Point[] p = null;
n = inp.nextInt();
p = new Point[n];
for(int i=0;i<n;i++){
p[i].x = inp.nextInt();
p[i].y = inp.nextInt();
}//end while

System.out.println("Your point's are:");

}//end main
}//end class IterableInterface

class Point implements Iterable{
public double x,y;

@Override
Iterable<Point> iterator(){
return this;
}//end iterator
}//end class Point