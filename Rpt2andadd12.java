/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpt2andadd12;

/**
 *
 * @author Dell
 */
public class Rpt2andadd12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=14,i;
        System.out.print(a+",");
        for(i=1;i<=8;i++)
        {
            if(i%2==0)
            {
                a+=12;
                System.out.print(a+",");
            }
            else
            {
                System.out.print(a+",");
            }
        }
    }
    
}
