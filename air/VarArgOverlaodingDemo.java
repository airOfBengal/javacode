class VarArgOverloadingDemo{
public static void main(String[] args){

var(true,false,true,true,false);
var(1,2,3,4,5);
var(1.1,2.2,3.3,4.4);
var("Atiq","Rony","Ripu");

}//end main

public static void var(boolean ... data){
System.out.println("No. of boolean data: "+data.length);
if(data.length > 0){
System.out.println("Elements are: ");
for(boolean s:data)
System.out.println(s);
}
}//end method

public static void var(int ... data){
System.out.println("No. of int data: "+data.length);
if(data.length > 0){
System.out.println("Elements are: ");
for(int s:data)
System.out.println(s);
}
}//end method 


public static void var(double ... data){
System.out.println("No. of double data: "+data.length);
if(data.length > 0){
System.out.println("Elements are: ");
for(double s:data)
System.out.println(s);
}
}//end method


public static void var(String ... data){
System.out.println("No. of String data: "+data.length);
if(data.length > 0){
System.out.println("Elements are: ");
for(String s:data)
System.out.println(s);
}
}//end method
}//end class