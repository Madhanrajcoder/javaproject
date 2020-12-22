/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package witargnoreturn;
import java.util.*;

/**
 *
 * @author Dell
 */
public class Witargnoreturn {

    static void pali(int n)
    {
        
        int r,sum=0,temp;    
         temp=n;    
        while(n>0){    
            r=n%10;  
            sum=(sum*10)+r;    
            n=n/10;    
        }    
    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");   
    }
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a=new Scanner(System.in);
        int s=a.nextInt();
        pali(s);
    }
    
}
