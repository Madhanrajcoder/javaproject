/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descend;

/**
 *
 * @author Dell
 */
public class Descend {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int rows =5;
    for (int i = rows; i >= 1; i--)
    {
        for (int j = rows; j >= i; j--)
        {
              System.out.print(j+" ");
        }
 
        System.out.println();
    }
    }
    
}
