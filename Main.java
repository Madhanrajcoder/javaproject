/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg35rand;

/**
 *
 * @author Dell
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=3,b=5;
        for(int i=1;i<=9;i++)
        {
            if(i%3==0)
                
                {
                    System.out.print("35"+",");
                }
            
            else if(i%2==0)
                {
                    System.out.print(b+",");
                    b=b+5+2;
                }
            else
                {
                    System.out.print(a+",");
                    a=a+5+2;
                
                }
        }
    }
}
