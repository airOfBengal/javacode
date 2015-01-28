class VarArgDemo{
public static void main(String[] args){
v(1,2,3);
v(1);
v();
}//end main

public static void v(int ... v){
System.out.println("No. of args: "+v.length);
if(v.length > 0){
System.out.println("Elements are: ");
for(int x:v)
System.out.print(x+" ");
System.out.println();
}//end if
}//end method v
}