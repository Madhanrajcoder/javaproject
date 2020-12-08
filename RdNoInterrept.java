/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.rd.no.interrept;

/**
 *
 * @author Dell
 */
public class RdNoInterrept {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=9,i;
        
        for(i=1;i<=7;i++)
        {
            if(i%3==0)
            {
                System.out.print("33"+",");
            }
            else
            {
                System.out.print(a+",");
                a+=2;
            }
        }
    }
    
}
