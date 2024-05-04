package com.java.io;

public class PersonPublicClass {

	public static void main(String[] args) 
	{
		Person personOne = new Person();
		personOne.setAge(10);
		personOne.setName("George");
		System.out.println(personOne.getAge());
		System.out.println(personOne.getName());
		Person personTwo = new Person("Rocky",20);
		System.out.println(personTwo.getAge());
		System.out.println(personTwo.getName());

	}

}
