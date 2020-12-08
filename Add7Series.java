/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add.pkg7.series;

/**
 *
 * @author Dell
 */
public class Add7Series {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=9,i;
        System.out.print(a+",");
        for (i=1;i<=8;i++)
        {
            a=a+7;
            System.out.print(a+",");
        }
    }
    
}
