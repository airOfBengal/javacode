class ThreadJoinDemo{
public static int a=0;

public static boolean isPrime(int n){
if(n <= 1) return false;
if(n == 2) return true;
if(n % 2 ==0) return false;
for(int i=3;i*i <= n;i+= 2)
if(n%i == 0) return false;
return true;
}//end method isPrime

public static void main(String[] args){
Scanner inp = new Scanner(System.in);
int n;
while((n = inp.nextInt())!=0){
for(int i=0;i<=n;i++){
if(isPrime(a)){
System.out.println(Thread.currentThread().getName()+": "+(a++));
}else{
new Thread(new A(),"A").start();
}//end if-else
//a++;
}//end for
}//end while
}//end main
}//end class

class A implements Runnable{
//String name;
public A(){
}//end constructor
public void run(){
System.out.println(Thread.currentThread().getName()+": "+(ThreadJoinDemo.a++));
}//end run
}//end class A