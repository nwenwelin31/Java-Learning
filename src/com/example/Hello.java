package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box<Integer> box1 = new Box<Integer>();
		box1.set(12);
		System.out.println(box1.get());
		
		Box<String> box2 = new Box<String>();
		box2.set("NNL");
		System.out.println(box2.get());
		
		System.out.print("Hello1 world");
		String fruit1 = "Banana";
		String fruit2 = "Strawberry";
		String fruit3 = "Apple";
		
		System.out.println("I like "+ fruit1);
		System.out.println("I like "+ fruit2);
		System.out.println("I like "+ fruit3);
		sayHello();
		sayHi("Hi",24);
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter name: ");
//		String line = scanner.nextLine();
//		System.out.println(line);
		
		File file = new File("C:\\Users\\PC061\\Documents\\reason.txt");
		try {
			Scanner scanner = new Scanner(file);
			System.out.println("file exists");
			String line1= scanner.nextLine();
			String line2 = scanner.nextLine();
			System.out.println(line1);
			System.out.println(line2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file not found");
			e.printStackTrace();
		}
	}
	
	//methods
	public static void sayHello() {
		
		System.out.println("Hello");
	}
	
	//arguments with method
	public static void sayHi(String str, int age) {
		
		System.out.println("I say "+str+"\n Age: "+age);
	}

}
