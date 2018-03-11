package com.Innerclass;
import java.util.*;
class Test {
	
   public void display(){
	  Inner in=new Inner();
	  in.show();
  }
  class Inner
  {
	  public void show(){
		  System.out.println("inside inner");
	  }
  }
}
  
 public class OuterClass{
	public static void main(String[] args){
		Test t =new Test();
	    Test.Inner i= t.new Inner();
		i.show();	
	}
}
