/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

/**
 *
 * @author Dell
 */
public class Palindrome {

    static void pali()
    {
        int r,sum=0,temp;    
  int n=12321;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
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
        pali();
    }
    
}
