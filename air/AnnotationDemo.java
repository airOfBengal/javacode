import java.lang.annotation.*;
import java.lang.reflect.*;

// An annotation type declaration.
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
String str();
int val();
}//end MyAnno

class AnnotationDemo{
// Annotate a method
@MyAnno(str="Annotation Example",val=100)
public static void myMeth(){

try{
Class c = this.getClass();
}catch(Exception e){
e.printStackTrace();
}//end try-catch

}//end method myMeth
}//end class AnnotationDemo