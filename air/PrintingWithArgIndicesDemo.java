public class PrintingWithArgIndicesDemo{
public static void main(String[] args){
//=====================================================================
// Argument Index:
// An argument index is an optional integer followed by a $ sign that
// indicates the argument's position in the argument list.
// Argument indices enable programmers to reorder the output so that
// the arguments in the argument list are not necessarily in the order
// of their corresponding format specifiers. Argument indices also help
// avoid duplicating arguments. It's like C# {index}.
//=====================================================================

System.out.printf("%3$s\t%1$s\t%2$s\n","rony","ripu","atiq");

}//end main
}//end class