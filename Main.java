/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg70alter;

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
        int a=70,b=71;
        System.out.print(a+","+b+",");
        for(int i=2;i<=10;i++)
        {
            if(i%3==0)
            {
                System.out.print(a+",");
            }
            else
            {
                b+=5;
                System.out.print(b+",");
            }
        }
    }
    
}
