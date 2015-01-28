import java.util.Scanner;

class ComparableInterfaceDemo{
public static void main(String[] args){
Scanner inp = new Scanner(System.in);
Alphabet a,b;

a = new Alphabet();
b = new Alphabet();

a.setChar(inp.next().charAt(0));
b.setChar(inp.next().charAt(0));

if(a.compareTo(b) > 0)
System.out.println(a.getChar()+" "+b.getChar());
else if(a.compareTo(b) < 0)
System.out.println(b.getChar()+" "+a.getChar());
else
System.out.println(a.getChar()+"=="+b.getChar());

}//end main
}//end class



class Alphabet implements Comparable<Alphabet>{
private char c;
public void setChar(char c){
this.c = c;
}//end method setChar

public char getChar(){
return this.c;
}

public int compareTo(Alphabet alphabet){
if(this.c < alphabet.getChar())
return 1;
if(this.c > alphabet.getChar())
return -1;

return 0;

}//end method compareTo
}//end class Alphabet