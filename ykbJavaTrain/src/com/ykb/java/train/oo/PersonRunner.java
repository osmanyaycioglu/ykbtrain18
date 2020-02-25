package com.ykb.java.train.oo;

public class PersonRunner {
	public static void main(String[] args) {
//		Person person = null;
		Person person = new Person();
		person.setName("osman");
		person.setSurname("yay");
		person.setAge(50);
		
		Person person2 = new Person();
		person2.setName("osman");
		person2.setSurname("yay");
		person2.setAge(50);
		
		if (person == person2) {
			System.out.println("İkisi eşit");
		} else {
			System.out.println("Eşit değildir");
		}
		
		if (person.equals(person2)) {
			System.out.println("E: İkisi eşit");
		} else {
			System.out.println("E: Eşit değildir");
		}
		
		String s = "osman";
		String s1 = new String("osman");
		if (s.equals(s1)) {
			System.out.println("Osmanlar eşit.");
		} else {
			System.out.println("Osmanlar eşit değil.");
		}
		
		System.out.println("Person : " + (person == null ? "null" : person.toString()));
		System.out.println("Person : " + person);
	}
}
