package v1.ch3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompactorTest {

	public static void main(String[] args) {
		List<Person1> list = new ArrayList<>();
		list.add(new Person1("dd", 20));
		list.add(new Person1("cc", 10));
		for (Person1 person : list) {
			System.out.println(person.getName() + ":" + person.getAge());
		}
		Collections.sort(list, new Person1Compactor());
		for (Person1 person : list) {
			System.out.println(person.getName() + ":" + person.getAge());
		}
	}
}

class Person1Compactor implements Comparator<Person1> {
	@Override
	public int compare(Person1 o1, Person1 o2) {
		return o1.getAge() - o2.getAge();
	}
}

class Person1 {
	private String name;
	private int age;

	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}