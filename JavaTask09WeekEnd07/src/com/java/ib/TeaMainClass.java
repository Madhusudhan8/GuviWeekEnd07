package com.java.ib;

public class TeaMainClass {

	public static void main(String[] args)
	{
	
		System.out.println("Original Tea Preparation");
		Tea tea = new Tea();
		tea.prepareTea();
		tea.addMilk();
		tea.addSugar();
		
		//method overloading compiletime polymorphism
		System.out.println("Black Tea Preparation");
		BlackTea blackTea = new BlackTea();
		blackTea.prepareTea();
		blackTea.addMilk();
		blackTea.addSugar();
		
		System.out.println("Green Tea Preparation");
		GreenTea greenTea = new GreenTea();
		greenTea.prepareTea();
		greenTea.addMilk();
		greenTea.addSugar();
		
		System.out.println("Herbal Tea Preparation");
		HerbalTea herbalTea = new HerbalTea();
		herbalTea.prepareTea();
		herbalTea.addMilk();
		herbalTea.addSugar();
		
		//Runtime Polymorphism overriding
		System.out.println("Black Tea Preparation");
		Tea blackTeaOne =  new BlackTea();
		blackTeaOne.prepareTea();
		blackTeaOne.addMilk();
		blackTeaOne.addSugar();
		
		System.out.println("Green Tea Preparation");
		Tea greenTeaOne =  new GreenTea();
		greenTeaOne.prepareTea();
		greenTeaOne.addMilk();
		greenTeaOne.addSugar();
		
		System.out.println("Herbal Tea Preparation");
		Tea herbalTeaOne = new HerbalTea();
		herbalTeaOne.prepareTea();
		herbalTeaOne.addMilk();
		herbalTeaOne.addSugar();
	}

}
