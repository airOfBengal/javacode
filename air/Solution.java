import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Solution {
// public static boolean isPrime(int a){
//        if(a==1) return false;
//        if(a == 2)return true;
//        if(a %2==0) return false;
//        for(int i=3;i*i<=a;i += 2)
//            if(a%i == 0)
//                return false;
//        return true;
//    }
       
   // public static final int con = 999999999;
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(System.out);
       
        br.close();
        pw.close();
        
    }//end main
    
    public static StringTokenizer st;
    public static BufferedReader br;
    public static PrintWriter pw;
   


    public static String nextToken() throws IOException {
        while ( st == null || !st.hasMoreTokens() ) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }//end method nextToken
    
    static class IPAddValidation{
        public void run() throws IOException{
            int n;
            String text;
            Matcher ip4matcher,ip6matcher;
            Pattern ip4= Pattern.
                    compile("\b\d\b|\b[1-9]\d\b|\b1\d\d\b|\b2[0-5][0-5]\b"+
                    "\.\b\d\b|\b[1-9]\d\b|\b1\d\d\b|\b2[0-5][0-5]\b"+
                    "\.\b\d\b|\b[1-9]\d\b|\b1\d\d\b|\b2[0-5][0-5]\b"+
                    "\.\b\d\b|\b[1-9]\d\b|\b1\d\d\b|\b2[0-5][0-5]\b");
            Pattern ip6 = Pattern.compile("\b[\d[a-fA-F]]{4}\b:"+
                    "\b[\d[a-fA-F]]{4}\b:\b[\d[a-fA-F]]{4}\b:"+
                    "\b[\d[a-fA-F]]{4}\b:\b[\d[a-fA-F]]{4}\b:"+
                    "\b[\d[a-fA-F]]{4}\b:\b[\d[a-fA-F]]{4}\b:"+
                    "\b[\d[a-fA-F]]{4}\b");
            
            n = Integer.parseInt(nextToken());
            while(n-- != 0){
                text = nextToken();
                ip4matcher = ip4.matcher(text);
                ip6matcher = ip6.matcher(text);
                if(ip4matcher.find()) pw.write("IPv4\n");
                else if(ip6matcher.find()) pw.write("IPv6\n");
                else pw.write("Neither\n");
                pw.flush();
            }//end while
        }//end run
    }//end inner class IPAddValidation

}//end class Solutiond


