package com.Pract;

import java.util.*;

public class Sort_Object_in_List {
	private String id;
	private String name;

	Sort_Object_in_List(String i, String n) {          //making constructor
		this.id = i;
		this.name = n;
	}

	public String getId() {                          //getter and setter
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	static void disp(List<Sort_Object_in_List> list) {
		for(Sort_Object_in_List obj : list) {
			System.out.println(obj.getId() + " " + obj.getName());
		}
	}
	
	public static void sort(List<Sort_Object_in_List> list) {               //sorting the object
		 
        list.sort((o1, o2)-> o1.getId().compareTo(o2.getId()));
    }

	public static void main(String[] args) {

		List<Sort_Object_in_List> list = new ArrayList<>();

		list.add(new Sort_Object_in_List("1", "A"));
		list.add(new Sort_Object_in_List("3", "C"));
		list.add(new Sort_Object_in_List("4", "D"));
		list.add(new Sort_Object_in_List("2", "B"));
		
		sort(list);
		disp(list);
	}
}
