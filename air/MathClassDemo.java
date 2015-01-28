

class MathClassDemo {
public static void main(String[] args) {
try{
System.out.println("sin(NaN): "+Math.sin(Double.valueOf("abc")));
System.out.println("sin(infinity): "+Math.sin(1/0.0));
}catch(NumberFormatException e){
System.out.println(e.toString());
}//end try-catch
}//end main
}//end class