/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Dell
 */
class employe 
{
    void name()
    {
        String name="vijay";
        System.out.println(name);
    }
}
class detail extends employe
{
    void id()
    {
        int id=103;
        System.out.println(id);
    }
}
class sal extends employe
{
    void amt()
    {
        int amtsal=40000,tot;
        int bonus=10000;
        tot=amtsal+bonus;
        System.out.println(tot);
    }
}
 class Inheritance {
    public static void main(String[] args) {
        sal s=new sal();
        detail d=new detail();
        d.name();
        d.id();
        s.amt();
        
    }
    
}
