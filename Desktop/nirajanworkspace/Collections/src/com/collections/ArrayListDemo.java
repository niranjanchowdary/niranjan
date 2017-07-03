package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListDemo {
ArrayList<Intern> arrayList=new ArrayList<>();// arraylist declaration
	private boolean newIntern(Intern obj) {	//adding intern details to arraylist 
		if(arrayList.add(obj))
		return true;
		else return false;
	}
	
	public void viewDetails(){ //displaying arraylist details
		 Iterator<Intern> itr=arrayList.iterator();
		while(itr.hasNext()){
			Intern intern=(Intern)itr.next();
			System.out.println("Name :"+intern.getName()+" RegNo :"+intern.getRegNo()+" Address :"+intern.getAddress()+" PhoneNumber :"+intern.getPhNumber());
			
		}
	}
	public static void main(String args[]) {
		String name,regNo,address;
		Long phNumber;
		Scanner scanner=new Scanner(System.in);  // creating scanner class object
		System.out.println("enter Intern name "); //input from user
		name=scanner.next();
		System.out.println("enter Intern RegNo ");
		regNo=scanner.next();
		System.out.println("enter Intern Address");
		address=scanner.next();
		System.out.println("enter Intern PhoneNumber ");
		phNumber=scanner.nextLong();
		Intern obj=new Intern(name,regNo,address,phNumber);
		ArrayListDemo demo=new ArrayListDemo();
		if(demo.newIntern(obj))System.out.println("details are inserted");
		else System.out.println("details are not inserted");
		demo.viewDetails();
		scanner.close();//closing scanner object
		
	}
	
}
