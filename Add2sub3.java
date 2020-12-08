/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add2sub3;

/**
 *
 * @author Dell
 */
public class Add2sub3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=2,b=44;
        for(int i=1;i<=6;i++)
        {
            if(i%2==0)
            {
                System.out.print(b+",");
                b-=3;
            }
            else
            {
                System.out.print(a+",");
                a+=2;
            }
        }
    }
    
}
