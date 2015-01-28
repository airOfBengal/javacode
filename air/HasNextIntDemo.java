
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AIR
 */
public class HasNextIntDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        while(input.hasNextInt()){
            int i = input.nextInt();
            System.out.println("Yes: "+i);
        }
    }
}
