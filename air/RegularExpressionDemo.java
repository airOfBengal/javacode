import java.util.regex.*;
import java.util.Scanner;

class RegularExpressionDemo{
public static void main(String[] args){
Scanner inp = new Scanner(System.in);
Pattern pattern;
Matcher matcher;
String exp,input;
boolean f;

while(true){
f = false;
System.out.print("\n\nREGEXP is: ");
exp = inp.nextLine();
if(exp.equals("end")) break;
System.out.print("INPUT is:  ");
input = inp.nextLine();
try{
pattern = Pattern.compile(exp);
matcher = pattern.matcher(input);
}catch(Exception e){
System.out.println(e.toString());
continue;
}//end try-catch
while(matcher.find()){
System.out.println("Found: "+matcher.group()+"\nStart index: "+matcher.start()+"\nEnd index: "+(matcher.end()-1));
f = true;
}//end inner while

if(!f)
System.out.println("No match found");

}//end while

}//end main
}//end class