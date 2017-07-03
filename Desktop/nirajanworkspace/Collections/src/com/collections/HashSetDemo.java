package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashSetDemo {

	static String a ="";
	Set<Intern> set;

	public boolean addNewIntern(Intern obj) {// adding intern to set
		set = new HashSet<>();
		if (set.contains(obj))
			return false;
		else {
			set.add(obj);
			return true;
		}
	}

	public void remove(Intern obj) { // removing intern from set
		if (!set.isEmpty()) {
			if (set.contains(obj)) {
				set.remove(obj);
				System.out.println("item removed from set");
			} else
				System.out.println("item not found in set...");
		} else
			System.out.println("set is empty");

	}

	public String checkintern(Intern obj) { // check method
		if (!set.isEmpty()) {
			if (set.contains(obj))
				return "intern is available";
			else
				return "intern is not available";
		} else
			return "set is empty";
	}

	public String showSet() { // show method of hash set

if (!set.isEmpty()) {
			Iterator<Intern> itr = set.iterator();
			while (itr.hasNext()) {
				Intern in = (Intern) itr.next();
				a += "name :" + in.getName() + " regNumber :" + in.getRegNo() + "address :" + in.getAddress()
						+ "phoneNumber :" + in.getPhNumber() + "\n";
			}
		} else
			a = "sorry set is empty";
		return a;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);// scanner class object
		String name;
		String regNo;
		String address;
		Long phNumber;
		System.out.println("enter name of the intern");// input from user
		name = scanner.next();
		System.out.println("enter intern reg no");
		regNo = scanner.next();
		System.out.println("enter intern address");
		address = scanner.next();
		System.out.println("enter intern phnumber");
		phNumber = scanner.nextLong();

		Intern intern = new Intern(name, regNo, address, phNumber);// invoking
																	// Intern
																	// constructor
		HashSetDemo hashsetdemo = new HashSetDemo(); // object of HashSetDemo
		System.out.println(hashsetdemo.addNewIntern(intern)); // adding object
		System.out.println(hashsetdemo.checkintern(intern)); // searching object
		hashsetdemo.remove(intern); //removing an object
		System.out.println(hashsetdemo.checkintern(intern)); // searching object
		System.out.println(hashsetdemo.showSet());
		scanner.close(); // closing scanner class object

	}

}
