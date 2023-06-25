package com.app.tester;
import static utils.StudentCollectionUtils.populateList;
import java.util.List;

import com.app.core.Student;

public class test1 {

	public static void main(String[] args) {
		// Display all student details from student list
		
		List<Student> students=populateList();
		//imperative
		System.out.println("-----------------imperative style-------------");
		for(Student s:students)
		{
			System.out.println(s);
		}
		System.out.println();
		System.out.println();
		//1.Display all students details from studentList
		System.out.println("-----------------declarative style-------------");
		students.stream()
		.forEach(s->System.out.println(s));
		

	}

}
