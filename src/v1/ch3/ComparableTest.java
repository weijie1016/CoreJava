package v1.ch3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
	public static void main(String[] args) {
		List<Person> list=new ArrayList<>();
		list.add(new Person("bb",20));
		list.add(new Person("aa",10));
		for (Person person : list) {
			System.out.println(person.getName()+":"+person.getAge());
		}
		Collections.sort(list);
		for (Person person : list) {
			System.out.println(person.getName()+":"+person.getAge());
		}
	}
}
class Person implements Comparable<Person>{
	private String name;
	private int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public int compareTo(Person o) {
		return this.age-o.getAge();
	}
}