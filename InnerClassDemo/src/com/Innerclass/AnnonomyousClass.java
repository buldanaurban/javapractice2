package com.Innerclass;
interface Animal
{
 void type();
}
public class AnnonomyousClass {
 public static void main(String args[])
 {
  Animal an = new Animal(){    //Annonymous class created
  public void type()
  {
   System.out.println("Annonymous animal"); 
  }
  
 };
   an.type();
  //an.type();      
 }
}