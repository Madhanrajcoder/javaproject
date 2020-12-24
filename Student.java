/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Dell
 */
public class Student {
    
    int enroll=180436;
    int m1=40,m2=50,m3=60,m4=45,m5=36;
    
    static void name()
    {
        String name="Madhanraj";
        int age=19,b=25,o=06,d=2001;
        
        System.out.println(name);
        System.out.println(age);
        System.out.println(b+"-"+o+"-"+d);
    }
    public void reg()
    {
      System.out.println(enroll);
      if(m1>=35 && m2>=35 && m3>=35 && m4>=35 && m5>=35)
      {
          System.out.println("pass");
      }
      else
          System.out.println("fail");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        name();
        Student obj=new Student();
        obj.reg();
    }
    
}
