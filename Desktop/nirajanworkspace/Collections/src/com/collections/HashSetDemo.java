package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashSetDemo {

	Set<Intern> set ;
	public boolean addNewIntern(Intern obj) {// adding intern to set
		 new HashSet<>();
		if (set.contains(obj))
			return false;
		else {
			set.add(obj);
			return true;
		}
	}

	public void remove(Intern obj) { // removing intern from set
		if (set != null) {
			if (set.contains(obj)) {
				set.remove(obj);
				System.out.println("item removed from set");
			} else
				System.out.println("item not found in set...");
		} else
			System.out.println("set is empty");

	}

	public String checkintern(Intern obj) {
		if (set != null) {
			if (set.contains(obj))
				return "intern is available";
			else
				return "intern is not available";
		} else
			return "set is empty";
	}

	public String showSet() {
		Iterator<Intern> itr = set.iterator();
		String a = null;
		if (set != null) {

			while (itr.hasNext()) {
				Intern in = (Intern) itr.next();
				a = "name :" + in.getName() + " regNumber :" + in.getRegNo() + "address :" + in.getAddress()
						+ "phoneNumber :" + in.getPhNumber() + "\n";
			}
		} else
			a = "sorry set is empty";
		return a;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String name;
		String regNo;
		String address;
		Long phNumber;
		System.out.println("enter name of the intern");
		name = scanner.next();
		System.out.println("enter intern reg no");
		regNo = scanner.next();
		System.out.println("enter intern address");
		address = scanner.next();
		System.out.println("enter intern phnumber");
		phNumber = scanner.nextLong();

		Intern intern = new Intern(name, regNo, address, phNumber);
		HashSetDemo hashsetdemo=new HashSetDemo();
		System.out.println(hashsetdemo.addNewIntern(intern));
		System.out.println(hashsetdemo.checkintern(intern));
		hashsetdemo.remove(intern);
		scanner.close();

	}

}
