package com.java.exception4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExceptionDemo01 {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Enter the path of the file");
			Scanner scan= new Scanner(System.in);
			String filePath=scan.nextLine();
			FileInputStream fis = new FileInputStream(filePath);		
		}
		catch(FileNotFoundException fine)
		{
			fine.printStackTrace();
			System.out.println("File Not found");
			System.out.println("Enter the correct path");
			
		}
	}

}
