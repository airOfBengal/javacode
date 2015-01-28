import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileDescriptor;

public class SerializationDemo{
public static void main(String[] args){

// object serialization
try{
MyClass object1 = new MyClass("Hello",-7,2.7);
System.out.println("object1: "+object1.toString());

FileOutputStream fos = new FileOutputStream(FileDescriptor.out);
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(object1);
oos.flush();
oos.close();
}catch(Exception e){
System.out.println(e.toString());
}//end try-catch

// object deserialization
try{
MyClass object2;
FileInputStream fis = new FileInputStream(FileDescriptor.in);
ObjectInputStream ois = new ObjectInputStream(fis);
object2 = (MyClass)ois.readObject();
ois.close();
System.out.println("object2: "+object2.toString());
}catch(Exception e){
}//end try-catch
}//end method main
}//end class SerializationDemo



class MyClass implements Serializable{
String s;
int i;
double d;

public MyClass(String s,int i,double d){
this.s = s;
this.i = i;
this.d = d;
}//end constructor


public String toString(){
return "s: "+s+"; i: "+i+"; d: "+d;
}//end method toString

}//end class MyClass