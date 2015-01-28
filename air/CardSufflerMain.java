import java.util.Random;
import java.util.ArrayList;
import java.util.concurrent.*;


class CardSufflerMain{
public static void main(String[] args) throws Exception {

new Thread(new CardGenerator(),"Card Generator").start();
new Thread(new CardSuffler(),"Card Suffler").start();

}//end main
}//end class CardSufflerMain

class Card{
	static String color[] = {"red","black"};
	static String suit[] = {"H","S","D","C"};
	static String card[] = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	static int size = 52;
	static ArrayList<Integer> cards = new ArrayList<Integer>();
}//end class Card

class CardSuffler implements Runnable{
CardSuffler(){

}//end constructor

public void run(){

System.out.println("A\tB\tC\tD");
for(int i=0;i<Card.cards.size();i++)
if(i%4==0){ System.out.println(Card.cards.get(i));
try{Thread.sleep(100);}catch(Exception e){}
System.out.println("in the Card Suffler");
}
else
System.out.print(Card.cards.get(i)+"\t");

}//end run
}//end class CardSuffler

class CardGenerator implements Runnable{
CardGenerator(){
}//end constructor

public void run(){
Random r = new Random();

while(Card.cards.size() != Card.size){
int v = r.nextInt(52);
if(!Card.cards.contains(v)){
Card.cards.add(v);
System.out.println("In the Card Generator");
}
}//end while

}//end run
}//end class CardGenerator