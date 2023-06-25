package tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<String> string=new ArrayList<>(Arrays.asList("one","two","threee"));
		//display the list 
		string.forEach(s->System.out.println(s));
		//remove all the strings with length > 5
		string.removeIf(s -> s.length()> 5);
		string.forEach(s->System.out.println(s));
	}

}
