/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geterandseter;

/**
 *
 * @author Dell
 */
 class Geterandseter 
 { 
    private int x, y, z; 
    public void setX(int a)
    { 
      x = a; 
    } 
 public void setY(int b)
  { 
   y = b; 
  } 
 public void setZ(int c)
  { 
    z = c; 
  } 
 void sum()
 { 
   int s = x + y + z; 
   System.out.println("Sum: " +s); 
  }
 } 
        
 public class MySum 
 { 
 public static void main(String[] args) 
  { 
    Geterandseter a = new Geterandseter(); 
       a.setX(10); 
       a.setY(20); 
       a.setZ(30); 
       a.sum(); 
   } 
}
    

