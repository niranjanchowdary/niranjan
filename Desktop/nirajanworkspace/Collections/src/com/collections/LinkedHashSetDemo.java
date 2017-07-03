package com.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	Set<Intern> set;

	public String addIntern(Intern object) {
		set = new LinkedHashSet<>();

		if (set.contains(object))
			return "sorry item is already there";
		else {
			set.add(object);
			return "Details are added";
		}
	}

	public void removeIntern(Intern obj) {
		if (!set.isEmpty()) {
			if (set.contains(obj)) {
				set.remove(obj);
				System.out.println("item is removed from list");
			} else
				System.out.println("item is not available in set");
		} else
			System.out.println("sorry set is empty");
	}

	public void searchIntern(Intern obj) {
		if (!set.isEmpty()) {
			if (set.contains(obj))
				System.out.println("item is available");
			else
				System.out.println("item is not there in set");

		} else
			System.out.println("set is empty");
	}

	public static void main(String args[]){
		Intern obj=new Intern("niranjan", "dfgh", "address", 45678L);
		Intern obj1=new Intern("niranjanhh", "dfgh", "address", 45678L);
		LinkedHashSetDemo linkhashset=new LinkedHashSetDemo();
		System.out.println(linkhashset.addIntern(obj));
		System.out.println(linkhashset.addIntern(obj1));
		linkhashset.searchIntern(obj1);
		linkhashset.searchIntern(obj);
		linkhashset.removeIntern(obj1);
		linkhashset.searchIntern(obj1);
	}
}
