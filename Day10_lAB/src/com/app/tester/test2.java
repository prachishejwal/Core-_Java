package com.app.tester;
import static utils.StudentCollectionUtils.populateList;
import static utils.StudentCollectionUtils.populateMap;

import java.util.List;
import java.util.Map;

import com.app.core.Student;

public class test2 {

	public static void main(String[] args) {
		//2. Display all student details from a student map

		
		List<Student> students=populateList();
		Map<String,Student> studentmap=populateMap(students);
		
		//populateMap(populateList());
		
		System.out.println();
		System.out.println();
		//1.Display all students details from studentList
		System.out.println("-----------------declarative style-------------");
		studentmap.forEach((k,v)->System.out.println(v));
		
		//map i/f ----->forEach(BiConsumer)------>biconusmer(is functional)--->yes------>go with that method
		
		

	}

}
