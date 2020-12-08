/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add2twiceandsub3;

/**
 *
 * @author Dell
 */
public class Add2twiceandsub3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=42;
        System.out.print(a+",");
        for(int i=1;i<=10;i++)
        {
            if(i%3==0)
            {
                a-=3;
                System.out.print(a+",");
            }
            else
            {
                a-=2;
                System.out.print(a+",");
            }
        }
    }
    
}
