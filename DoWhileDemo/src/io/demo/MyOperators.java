package io.demo;

public class MyOperators
{
 public static void main(String[] args)
 {
	 String s1 = "Welcome";
	 String s2="To Java";
	 String s3=s1+s2;
	 String s4=s1.concat(s2);
	 System.out.println(s3.hashCode() +" "+ s4.hashCode());
	 System.out.println(s3==s4);
	System.out.println(s3.equals(s4));
 }
}