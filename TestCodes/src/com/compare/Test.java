package com.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(3, "Vinay"));
		list.add(new Employee(1, "kiran"));
		list.add(new Employee(2, "Durga"));
		list.add(new Employee(4, "Bunny"));
		Collections.sort(list);
		System.out.println(list);

		ArrayList<Users> list2 = new ArrayList<Users>();

		list2.add(new Users(67, "kishore", "Python"));
		list2.add(new Users(33, "teja", "Golang"));
		list2.add(new Users(98, "bhavan", "Ruby"));
		list2.add(new Users(23, "saikiran", "Java"));

		Collections.sort(list2, new IdComparator());
		System.out.println(list2);

		Collections.sort(list2, new NameComparator());
		System.out.println(list2);

		Comparator<Users> domainComparator = new Comparator<Users>() {

			@Override
			public int compare(Users u1, Users u2) {
				return u1.getDomain().compareTo(u2.getDomain());
			}

		};
		Collections.sort(list2, domainComparator);
		System.out.println(list2);
		System.out.println("-------------------------------------------------------------");
		Collections.sort(list2,(u1,u2)->{return Integer.compare(u1.getId(), u2.getId());});
		System.out.println("ID Sort: "+list2);
		Collections.sort(list2,(u1,u2)->u1.getName().compareTo(u2.getName()));
		System.out.println("Name Sort: "+list2);
		Collections.sort(list2,(u1,u2)->u1.getDomain().compareTo(u2.getDomain()));
		System.out.println("Domain Sort: "+list2);
		System.out.println("-------------------------------------------------------------");
		Comparator<Users> idComparator = new Comparator<Users>() {
			@Override
			public int compare(Users u1, Users u2) {
				return Integer.compare(u1.getId(), u2.getId());
			}
		};
		TreeSet<Users> treeSet = new TreeSet<Users>((u1,u2)->{return Integer.compare(u1.getId(), u2.getId());});
		treeSet.add(new Users(12,"kiran","Dot Net"));
		treeSet.add(new Users(10,"revon","Networks"));
		treeSet.add(new Users(19,"rishabh","java"));
		treeSet.add(new Users(7,"Rahul","Python"));
		System.out.println(treeSet);
		
		
		

		

	}

}
