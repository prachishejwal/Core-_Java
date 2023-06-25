package com.app.tester;
import static utils.StudentCollectionUtils.populateList;

import java.util.List;

import com.app.core.Student;

public class test3 {

	public static void main(String[] args) {
		//2. Display all student details from a student map

		
		List<Student> studentlist=populateList();
		
		
		//populateMap(populateList());
		
		System.out.println();
		System.out.println();
		//3. Display all student details(list) sorted as per GPA 

		//list----->collection--->Stream()---->I/F Stream---->sorted() natural or sorted(Comparator....)
		System.out.println("-----------------declarative style-------------");
		
		//asending order
		studentlist.stream()//Stream<Students>
		.sorted((s1,s2)->((Double)s1.getGpa()).compareTo(s2.getGpa()))
		.forEach(s->System.out.println(s));
		
		
		
		

	}

}
