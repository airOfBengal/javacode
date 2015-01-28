public class MethodOverloadingDemo{

final static void display(int a,double b){
System.out.println(a+b);
}
final static void display(int a,int b){
System.out.println(a+b);
}
final static void display(String s,int a){
System.out.println(s+a);
}

public static void main(String[] args){
display(1,2.5);
display(1,2);
display("Atiq",2);
}
}