public class OverloadingDemo{

public static void display(int a,double d){
System.out.println(a+d);
}

public static double display(int a ,double d){
return a+d;
}


public static void main(String[] args){

display(2,4.5);
System.out.println(display(2,4.5));

}//end main
}//end class