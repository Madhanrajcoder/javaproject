/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructer;

/**
 *
 * @author Dell
 */
public class Constructer {
      private int rollNum;
   Constructer()
   {
      rollNum =100;
   }
   Constructer(int rnum)
   {
      this();
      
      rollNum = rollNum+ rnum;
   }
   public int getRollNum() {
	  return rollNum;
   }
   public void setRollNum(int rollNum) {
	  this.rollNum = rollNum;
   }
   public static void main(String args[])
   {
	   Constructer obj = new Constructer(145);
       System.out.println(obj.getRollNum());
    }
}
    

