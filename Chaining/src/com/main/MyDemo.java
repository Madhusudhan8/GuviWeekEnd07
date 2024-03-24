package com.main;

import com.chaining.Employee1;
import com.contructor.chaining.Cube;

public class MyDemo {

	public static void main(String[] args) {
		
		Employee1 emp = new Employee1(1,"Ram","BE","Bangalore");
		emp.display();
		
		Cube cu = new Cube(5.5);
		cu.calcVolume();
		cu.calcArea();
		
		
		
		
	}

}
