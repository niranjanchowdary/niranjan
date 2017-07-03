package com.collections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {

	LinkedList<Intern> linkedlist = new LinkedList<>();

	public boolean addNewIntern(Intern obj) {

		if (linkedlist.add(obj))
			return true;
		else
			return false;

	}

	public void addNewIntrenAtFirst(Intern obj) {
		linkedlist.addFirst(obj);
		System.out.println("details are inserted at first position");
	}

	public void addNewIntrenAtLast(Intern obj) {
		linkedlist.addLast(obj);
		System.out.println("details are inserted at last position");
	}

	public void removeIntrenAtFirst() {
		linkedlist.removeFirst();
		System.out.println("details are removed from first position");
	}

	public void removeIntrenAtLast() {
		linkedlist.removeLast();
		System.out.println("details are removed from last position");
	}
	public void removeIntren(Intern obj)
	{
		linkedlist.remove(obj);
		System.out.println("details are removed ");
	}
public static void main(String args[]){
	
String name;
String regNo;
String address;
Long phNumber;
Scanner scanner=new Scanner(System.in); 
System.out.println("enter name of the intern");
name=scanner.next();
System.out.println("enter reg number");
regNo=scanner.next();
System.out.println("enter address");
address=scanner.next();
System.out.println("enter phone number");
phNumber=scanner.nextLong();


Intern intern=new Intern(name, regNo, address, phNumber);
LinkedListDemo obj=new LinkedListDemo();
obj.addNewIntern(intern);
obj.addNewIntrenAtFirst(intern);
obj.addNewIntrenAtLast(intern);
obj.removeIntren(intern);
obj.removeIntrenAtFirst();
obj.removeIntrenAtLast();

scanner.close();
}
}
