import java.util.concurrent.*;

class SemaphoreDemo{
	public static void main(String args[]){
Semaphore sem = new Semaphore(1);

new IncThread(sem,"A");
new DecThread(sem,"B");
	}//end main
}//end class Semaphore

// A shared resource.
class Shared{
	static int count=0;
}//end class Shared

// A thread of execution that increments count.
class IncThread implements Runnable{

String name;
Semaphore sem;

IncThread(Semaphore s,String a){
sem =s ;
name =a;
new Thread(this).start();
}//end constructor

public void run(){

System.out.println("Starting "+name);

try{

//First, get a permit
System.out.println(name+" is waiting for permit.");
sem.acquire();
System.out.println(name+" gets a permit.");

//Now, access shared resources.
for(int i=0;i<5;i++){
Shared.count++;
System.out.println(name+": "+Shared.count);

//Now, allow a context switch -- if possible.
Thread.sleep(100);
}//end for

}catch(InterruptedException exc){
System.out.println(exc);
}//end try-catch

//Release the permit.
System.out.println(name+" releases the permit.");
sem.release();

}//end run

}//end class IncThread

// A thread of execution that decrements count.
class DecThread implements Runnable{

String name;
Semaphore sem;

DecThread(Semaphore s,String a){
sem =s ;
name =a;
new Thread(this).start();
}//end constructor

public void run(){

System.out.println("Starting "+name);

try{

//First, get a permit
System.out.println(name+" is waiting for permit.");
sem.acquire();
System.out.println(name+" gets a permit.");

//Now, access shared resources.
for(int i=0;i<5;i++){
Shared.count--;
System.out.println(name+": "+Shared.count);

//Now, allow a context switch -- if possible.
Thread.sleep(100);
}//end for

}catch(InterruptedException exc){
System.out.println(exc);
}//end try-catch

//Release the permit.
System.out.println(name+" releases the permit.");
sem.release();

}//end run

}//end class DecThread