import java.util.*;
import java.io.*;
//original class
class BiCycle
{
	String define_me()
  {
		return "a vehicle with pedals.";
	}
}
//class extending bicycle class
class MotorCycle extends BiCycle
{
	String define_me()
  {
		return "a cycle with an engine.";
	}
	//updating motorcycle methods
	MotorCycle()
  {
    //printing
		System.out.println("Hello I am a motorcycle, I am "+ define_me());
    //calling super method using super keyword
		String temp=super.define_me();
    //printing using super class method
		System.out.println("My ancestor is a cycle who is "+ temp );
	}
	
}
//main class
class Solution
{
	public static void main(String[] args)
  {
		MotorCycle M=new MotorCycle();
	}
}
