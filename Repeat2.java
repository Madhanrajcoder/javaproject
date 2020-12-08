/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeat.pkg2;

/**
 *
 * @author Dell
 */
public class Repeat2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=20;
        System.out.print(a+",");
        for(int i=1;i<=9;i++)
        {
            if(i%2==0)
            {
                a-=3;
                System.out.print(a+",");
            }
            else
            {
                System.out.print(a+",");
            }
        }
    }
    
}
