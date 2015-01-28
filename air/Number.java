class Num{
public Num(double d){
System.out.println(d);
}
}

public class Number extends Num{
public static void main(String[] args){
Num num = new Num(2.5);
}
}