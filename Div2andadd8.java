/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package div2andadd8;

/**
 *
 * @author Dell
 */
public class Div2andadd8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=664;
        System.out.print(a+",");
        for(int i=2;i<=8;i++)
        {
            if(i%2==0)
            {
                a=a/2;
                System.out.print(a+",");
            }
            else
            {
                a+=8;
                System.out.print(a+",");
                
            }
        }
    }
    
}
