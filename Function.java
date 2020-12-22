/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

/**
 *
 * @author Dell
 */
public class Function {

    static void mymethod()
    {
        int a=0,b=1,c,i,count=5;
        System.out.println(" "+a);
        for(i=2;i<count;i++)
        {
            c=a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
        }
    }
    public void oddeven()
    {
        int a=5;
        if(a%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        mymethod();
        Function obj=new Function();
        obj.oddeven();
    }
    
}
