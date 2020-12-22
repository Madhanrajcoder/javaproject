/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package withardwithreturn;

/**
 *
 * @author Dell
 */
public class Withardwithreturn {

    static int pali(int n)
    {
        int r,sum=0,temp;
        temp=n;    
        while(n>0){    
            r=n%10;  //getting remainder  
            sum=(sum*10)+r;    
            n=n/10;    
        }    
         if(temp==sum)
        {
            System.out.println("a palindrome");
            return sum;
        }
         else
         {
              System.out.println("not a palindrome");   
              return 0;
         }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(pali(12312));
    }
    
}
